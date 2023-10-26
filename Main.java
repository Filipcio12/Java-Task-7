import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Args is the number of input vectors!");
            return;
        }

        int num = 0;
        try {
            num = Integer.parseInt(args[0]);   
        }
        catch (NumberFormatException ex) {
            System.out.println("Failure parsing int.");
        }
        if (num == 0) {
            System.out.println("Failure parsing int.");
            return;
        }

        // An Array of fixed size which will contain lists of integers

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    }
}