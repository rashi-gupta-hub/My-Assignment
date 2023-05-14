package Basic_DSA;

import java.util.Scanner;

class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        int cnt = 0;

        if (subject1Marks > 60) {
            cnt++;
        }
        if (subject2Marks > 60) {
            cnt++;
        }
        if (subject3Marks > 60) {
            cnt++;
        }

        switch (cnt) {
            case 3:
                return "Passed";
            case 2:
                return "Promoted";
            default:
                return "Failed";
        }
    }
}

public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Input:- ");
        String input = scanner.nextLine();

        String[] marks = input.split(" ");
        double subject1Marks = Double.parseDouble(marks[0]);
        double subject2Marks = Double.parseDouble(marks[1]);
        double subject3Marks = Double.parseDouble(marks[2]);

        ResultDeclaration obj = new ResultDeclaration();
        String result = obj.declareResults(subject1Marks, subject2Marks, subject3Marks);

        System.out.println("Output:- " + result);

        scanner.close();
    }
}