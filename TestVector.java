import java.io.IOException;
import java.util.List;

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
        while (true) {
            try {
                sum = Vector.sumVectors(userInput.inputVectors(num));
                break;
            } catch (DifferentVectorLengthsException ex) {
                String msg = ex.getMessage();
                List<Integer> lengthList = ex.getLengthList();
                for (int i = 0; i < lengthList.size(); ++i) {
                    msg += (i + 1) + " vector length is " + lengthList.get(i) + ".\n";
                }
                System.out.println(msg);
            }
        }
        userInput.close();
        System.out.println(sum);
        
        try {
            IO.writeFile("result.txt", sum);
        } catch (IOException ex) {
            System.out.println("\nError opening the file.");
        } 
    }
}