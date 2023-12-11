import java.io.IOException;

public class TestVector {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Args is the number of input vectors!");
            return;
        }

        int num = 0;
        try {
            num = Integer.parseInt(args[0]);   
        } catch (NumberFormatException ex) {
            System.out.println("Failure parsing int.");
        }
        if (num < 2) {
            System.out.println("You must input at least 2 vectors.");
            return;
        }

        UserInput userInput = new UserInput();
        Vector sum;
        sum = userInput.inputVectorSum(num);
        userInput.close();

        try {
            IO.writeFile("result.txt", sum);
        } catch (IOException ex) {
            System.out.println("\nError opening the file.");
        } 
    }
}