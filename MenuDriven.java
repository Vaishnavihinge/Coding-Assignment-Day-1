
    import java.util.Scanner;

public class MenuDriven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Result = " + (num1 * num2));
                        break;

                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result = " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero not allowed");
                        }
                        break;
                }
            } 
            else if (choice != 0) {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        System.out.println("Program exited successfully.");
        sc.close();
    }
}

