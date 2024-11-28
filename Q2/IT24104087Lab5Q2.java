import java.util.Scanner;

public class IT24104087Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newMembers;

        while (true) {
            System.out.print("Enter the number of new members introduced (>= 0): ");
            newMembers = scanner.nextInt();
            if (newMembers >= 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number greater than or equal to 0.");
            }
        }

        String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
                break;
        }

        System.out.println("You are entitled to: " + prize);
    }
}
