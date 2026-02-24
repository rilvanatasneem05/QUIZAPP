
import java.util.Scanner;

public class QuizAPP {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int score = 0;

        // Question 1
        System.out.println("1. Which language is platform independent?");
        System.out.println("1. C");
        System.out.println("2. Java");
        System.out.println("3. C++");
        System.out.println("4. Python");
        System.out.print("Enter your answer: ");
        int ans1 = scan.nextInt();

        if (ans1 == 2) {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Wrong!");
        }

        // Question 2
        System.out.println("\n2. Who developed Java?");
        System.out.println("1. Dennis Ritchie");
        System.out.println("2. James Gosling");
        System.out.println("3. Guido van Rossum");
        System.out.println("4. Bjarne Stroustrup");
        System.out.print("Enter your answer: ");
        int ans2 = scan.nextInt();

        if (ans2 == 2) {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Wrong!");
        }

        // Question 3
        System.out.println("\n3. Which keyword is used to create object?");
        System.out.println("1. this");
        System.out.println("2. super");
        System.out.println("3. new");
        System.out.println("4. class");
        System.out.print("Enter your answer: ");
        int ans3 = scan.nextInt();

        if (ans3 == 3) {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Wrong!");
        }

        // Result
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        scan.close();
    }
}
