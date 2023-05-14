package Basic_DSA;

import java.util.ArrayList;
class ArmstrongNumBetweenRange {
    public int[] armstrongNumbersInRange(int min, int max) {
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();

        for (int num = min; num <= max; num++) {
            if (isArmstrongNumber(num)) {
                armstrongNumbers.add(num);
            }
        }

        int[] res = new int[armstrongNumbers.size()];
        for (int i = 0; i < armstrongNumbers.size(); i++) {
            res[i] = armstrongNumbers.get(i);
        }
        return res;
    }
    private boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        return sum == originalNumber;
    }
}

public class Assignment2Q2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;

        ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
        int[] armstrongNumbers = obj.armstrongNumbersInRange(min, max);

        System.out.println("Armstrong numbers between " + min + " and " + max + "-");
        for (int i = 0; i < armstrongNumbers.length; i++) {
            int num = armstrongNumbers[i];
            System.out.print(num + " ");
        }
    }
}