import java.util.*;

public class Check1 {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Cat", "Dog", "Frog", "Fish", "Wolf",
                "Bird", "Worm", "Range Rover", "Fish", "Wolf",
                "Dog", "Frog", "Fish", "Worm", "Worm",
                "Frog", "Fish", "Worm", "Worm", "Fish"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Initial array");
        System.out.println(words.toString());
        System.out.println();

        System.out.println("Unique words");
        System.out.println(unique.toString());
        System.out.println();

        System.out.println("Word frequency");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
