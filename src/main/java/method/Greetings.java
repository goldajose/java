package method;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Greetings {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.next();
        System.out.println(greetUser(name));;

    }

    public static String greetUser(String name) {
        return "Hello " + name + "!";
    }
}
