package variable_scope;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class CreditCheck {
    static int requiredSalary = 25000;
    static int requiredScore = 700;
    public static void main(String args[]) {

        int salary = getSalary();
        int score = getScore();
        boolean qualified = isUserQualified(salary, score);
        notifyUser(qualified);

    }

    public static int getSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your annual salary:");
        int salary = scanner.nextInt();
        return salary;
    }

    public static int getScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your credit score:");
        int score = scanner.nextInt();
        return score;
    }

    public static boolean isUserQualified(int salary, int score) {
        if ((salary >= requiredSalary) && (score >= requiredScore)) {
            return true;
        }
        return false;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats you are qualified");
        }
        System.out.println("Sorry, May be next time");
    }


}
