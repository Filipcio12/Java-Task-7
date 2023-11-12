import java.util.List;
import java.util.ArrayList;

public class TestVector {
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
        if (num < 2) {
            System.out.println("You must input at least 2 vectors.");
            return;
        }
        List<Vector> vectors = new ArrayList<Vector>();
        UserInput userInput = new UserInput();
        vectors = userInput.inputVectors(num);
        for (Vector vector : vectors) {
            System.out.println(vector);
        }
        userInput.close();
    }
}