import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        String nameFisrt;
        char A;
        int sum;
        int x;
        x=1;
        Scanner scanner = new Scanner(System.in);
        while (x != 0) {
            System.out.println("Insert your first name:");
            nameFisrt = scanner.next();
            System.out.println("Insert your first letter in last name:");
            A = scanner.next().charAt(0);
            System.out.println("Enter the first number (0-10):");
            firstNumber = scanner.nextInt();
            if (firstNumber >= 0 && firstNumber <= 10) {
            } else {
                System.out.println(" number is wrong");
                System.out.println("Enter the first number (0-10):");
                firstNumber = scanner.nextInt();
                while (firstNumber < 0 || firstNumber > 10) {
                    System.out.println(" number is wrong");
                    System.out.println("Enter the first number (0-10):");
                    firstNumber = scanner.nextInt();
                }
            }
            System.out.println("Enter the second number:");
            secondNumber = scanner.nextInt();
            if (secondNumber >= 0) {
                if (secondNumber <= 10) {

                } else {
                    System.out.println(" number is wrong:");
                    System.out.println("Enter the second number (0-10):");
                    secondNumber = scanner.nextInt();
                    while (secondNumber < 0 || secondNumber > 10) {
                        System.out.println(" number is wrong");
                        System.out.println("Enter the second number (0-10):");
                        secondNumber = scanner.nextInt();
                }
            }
            }
            sum = firstNumber + secondNumber;
            System.out.println("hello " + nameFisrt + " " + A + " the division of " + firstNumber + " and " + secondNumber + " is " + sum);
            System.out.println(" If you want to continue press 1 if you want to press 0");
            x = scanner.nextInt();
        }
        System.out.println(" thank you! ");
    }
    }