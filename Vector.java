import java.util.ArrayList;
import java.util.List;

public class Vector {
    List<Integer> components;

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
            catch(NumberFormatException ex) {
                System.out.println("Failure converting String to int");
            }
        }

        if (components.isEmpty()) {
            components.add(0);
        }
    }
    
    @Override
    public String toString() {
        String vectorString = "[";
        
        for (Integer component : components) {
            vectorString += component + ", ";
        }

        vectorString = vectorString.substring(0, vectorString.length() - 2);
        vectorString += "]";

        return vectorString;
    }
}
