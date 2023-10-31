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
            System.out.println("Failure parsing int.");
            return;
        }

        // An Array of fixed size which will contain lists of integers
        List<Vector> vectors = new ArrayList<Vector>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num; ++i) {
            String input = scanner.nextLine();
            String[] elemStrings = input.split(",");
            
            for (int j = 0; j < elemStrings.length; ++j) {
                String elemString = "";

                for (char c : elemStrings[j].toCharArray()) {
                    if (Character.isDigit(c)) {
                        elemString += c;
                    }   
                }

                elemStrings[j] = elemString;
            }

            for (String elemString : elemStrings) {
                Vector vector = new Vector(elemString);
                vectors.add(vector);
            }
        }

        scanner.close();

        for (Vector vector : vectors) {
            System.out.println(vector);
        }
    }
}