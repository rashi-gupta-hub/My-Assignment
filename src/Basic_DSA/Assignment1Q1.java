package Basic_DSA;


import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int n ) {
        int sum = 0;
        int temp = n;
        while(temp > 0) {
            int rem = temp % 10;
            sum += (rem*rem*rem);
            temp /= 10;
        }
        return (sum == n);
    }
}

public class Assignment1Q1 {
    public static void main(String[] args) {
        ArmstrongOrNot obj = new ArmstrongOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean isArmstrong = obj.armstrongCheck(n);
        if(isArmstrong) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        sc.close();
    }

}
