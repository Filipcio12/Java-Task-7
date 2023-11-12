import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    private List<Vector> input(int num) throws DifferentVectorLengthsException {
        List<Vector> vectors = new ArrayList<Vector>();

        for (int i = 0; i < num; ++i) {
            String input = scanner.nextLine();
            Vector vector = new Vector(input);
            vectors.add(vector);
        }

        int length = vectors.get(0).length();
        for (Vector vector : vectors) {
            if (vector.length() != length) {
                throw new DifferentVectorLengthsException();
            }
        }

        return vectors;
    }

    public List<Vector> inputVectors(int num) {
        List<Vector> vectors = new ArrayList<Vector>();
        while (true) {
            try {
                vectors = input(num);
                break;
            }
            catch(DifferentVectorLengthsException ex) {
                System.out.println("Please renter the vectors as they have different lengths!");
            }
        }
        return vectors;
    }

    public Vector inputVectorSum(int num) {
        Vector sum;
        
        while (true) {
            String input = scanner.nextLine();
            sum = new Vector(input);
            try {
                for (int i = 0; i < (num - 1); ++i) {
                    input = scanner.nextLine();
                    Vector v = new Vector(input);
                    sum.add(v);
                }
                break;
            } catch(DifferentVectorLengthsException ex) {
                System.out.println("Error");
            }
        }
        
        return sum;
    }

    public void close() {
        scanner.close();
    }
}
