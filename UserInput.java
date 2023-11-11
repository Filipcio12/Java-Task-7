import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    public static List<Vector> inputVectors(int num) throws DifferentVectorLengthsException {
        List<Vector> vectors = new ArrayList<Vector>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num; ++i) {
            String input = scanner.nextLine();
            Vector vector = new Vector(input);
            vectors.add(vector);
        }
        scanner.close();

        int length = vectors.get(0).length();
        for (Vector vector : vectors) {
            if (vector.length() != length) {
                throw new DifferentVectorLengthsException();
            }
        }

        return vectors;
    }
}
