package com.eric;

//Suppose you are given the following code: 
//
// 
//class FooBar {
//  public void foo() {
//    for (int i = 0; i < n; i++) {
//      print("foo");
//    }
//  }
//
//  public void bar() {
//    for (int i = 0; i < n; i++) {
//      print("bar");
//    }
//  }
//}
// 
//
// The same instance of FooBar will be passed to two different threads. Thread A will call foo() while thread B will call bar(). Modify the given program to output "foobar" n times. 
//
// 
//
// Example 1: 
//
// 
//Input: n = 1
//Output: "foobar"
//Explanation: There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar(). "foobar" is being output 1 time.
// 
//
// Example 2: 
//
// 
//Input: n = 2
//Output: "foobarfoobar"
//Explanation: "foobar" is being output 2 times.
// 
//


import java.util.concurrent.Semaphore;

public class PrintFoobarAlternately{

      public static void main(String[] args) {
          FooBar_2 solution = new PrintFoobarAlternately().new FooBar_2(4);
          new Thread(()-> {
              try {
                  solution.foo(() -> System.out.print("foo"));
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }).start();
          new Thread(()-> {
              try {
                  solution.bar(() -> System.out.print("bar"));
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }).start();
      }
   

//leetcode submit region begin(Prohibit modification and deletion)
class FooBar {
    private int n;
    Semaphore foo = new Semaphore(1);
    Semaphore bar = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            foo.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
        	bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
        	foo.release();
        }
    }
}

    class FooBar_2 {
        private int n;
        private volatile boolean fooRunned;
        public FooBar_2(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (this) {
                    // printFoo.run() outputs "foo". Do not change or remove this line.
                    while (fooRunned) {
                        wait();
                    }
                    printFoo.run();
                    fooRunned = true;
                    notifyAll();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (this) {
                    while (!fooRunned)
                        wait();
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    fooRunned = false;
                    notifyAll();
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}