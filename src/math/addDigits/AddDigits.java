package math.addDigits;

public class AddDigits {

    public int addDigits(int num) {
        while (num >= 10) {
            int tmp = num % 10;
            num /= 10;
            num = num + tmp;
        }
        return num;
    }

    public int addDigits_math(int num) {
        return (num - 1) % 9 + 1;
    }
}

