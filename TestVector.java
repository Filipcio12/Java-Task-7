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
        }
        catch (NumberFormatException ex) {
            System.out.println("Failure parsing int.");
        }
        if (num < 2) {
            System.out.println("You must input at least 2 vectors.");
            return;
        }
        try {
            List<Vector> vectors = UserInput.inputVectors(num);
        }
        catch(DifferentVectorLengthsException ex) {
            System.out.println("Vectors have different lengths!");
        }
    }
}