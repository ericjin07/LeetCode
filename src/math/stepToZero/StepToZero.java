package math.stepToZero;

public class StepToZero {

    public int numberOfSteps(int num) {
        int step = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            step++;
        }
        return step;
    }

    public int numberOfSteps_bit_manual(int num) {
        int step = 0;
        while (num > 0) {
            step += ((num > 1 ? 1 : 0) + (num & 1));   // if (num & 1) == 1 then num is odd
            num >>= 1;
        }
        return step;
    }
}
