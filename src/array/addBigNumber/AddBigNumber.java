package array.addBigNumber;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/21/2018 9:13 AM
 */
public class AddBigNumber {

    public String addBigNumber(String numA,String numB){
        //把两个大整数用数组逆序存储，数组长度等于较大整数+1，
        int maxLength = numA.length() > numB.length() ? numA.length() : numB.length();
        int arrA[] = new int[maxLength + 1];
        int arrB[] = new int[maxLength + 1];
        for (int i = 0; i < numA.length(); i++)
            arrA[i] = numA.charAt(numA.length()-1 - i) - '0';
        for (int i = 0; i < numB.length(); i++)
            arrB[i] = numB.charAt(numB.length()-1 - i) - '0';
        //构建结果数组，长度为较大整数位数+1
        int sum[] = new int[maxLength + 1];
        //遍历数组，按位相加
        for (int i = 0; i < maxLength + 1; i++){
            sum[i] += arrA[i];
            sum[i] += arrB[i];
            if (sum[i] >= 10 ){
                sum[i] -= 10;
                sum[i+1] = 1;
            }
        }
        //把结果再次逆序成string
        StringBuilder sb = new StringBuilder();
        //是否找到大整数的最高有效位
        boolean findFirst = false;
        for (int i = maxLength; i >= 0; i--){
            if (!findFirst){
                if (sum[i] == 0)
                    continue;
                findFirst = true;
            }
            sb.append(sum[i]);
        }
        return sb.toString();
    }


}
