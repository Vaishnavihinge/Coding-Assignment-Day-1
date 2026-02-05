import java.util.Scanner;

public class AverageOfFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            number = sc.nextInt();
            sum = sum + number;
        }

        double average = sum / 5.0;

        System.out.println("Average = " + average);

        sc.close();
    }
}
