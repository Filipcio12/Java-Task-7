import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Character;

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
            System.out.println("No vectors to read.");
            return;
        }

        // An Array of fixed size which will contain lists of integers
        List<Vector> vectors = new ArrayList<Vector>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num; ++i) {
            String input = scanner.nextLine();
            Vector vector = new Vector(input);
            vectors.add(vector);
        }

        scanner.close();

        for (Vector vector : vectors) {
            System.out.println(vector);
        }
    }
}