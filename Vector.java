import java.util.ArrayList;
import java.util.List;

public class Vector {
    private List<Integer> components;

    Vector() {
        components = new ArrayList<>();
        components.add(0); // 0 vector
    }

    Vector(String input) {
        components = new ArrayList<>();

        String[] nums = input.split(",");
        for (String num : nums) {
            try {
                int component = Integer.parseInt(num);
                components.add(component);
            }
            catch(NumberFormatException ex) {}
        }

        if (components.isEmpty()) {
            components.add(0);
        }
    }
    
    public String toString() {
        String vectorString = "[";
        
        for (Integer component : components) {
            vectorString += component + ", ";
        }

        vectorString = vectorString.substring(0, vectorString.length() - 2);
        vectorString += "]";

        return vectorString;
    }

    public int length() {
        return components.size();
    }

    public void add(Vector oVector) throws DifferentVectorLengthsException {
        int size = components.size();
        if (size != oVector.components.size()) {
            throw new DifferentVectorLengthsException();
        }

        for (int i = 0; i < size; ++i) {
            components.set(i, 
            components.get(i) + oVector.components.get(i));
        }
    }
}
