import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
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
