import java.util.Scanner;

public class IT24104087Lab5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = sc.nextInt();

        int largest = num1;
        int smallest = num1;

        if (num2 > num1) {
            largest = num2;
        }
        if (num3 > num2) {
            largest = num3;
        }

        if (num2 < num2) {
            smallest = num2;
        }
        if (num3 < num3) {
            smallest = num3;
        }

        System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}

  
  