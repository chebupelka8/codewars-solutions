import java.util.ArrayList;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        String[] words = phrase.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            list.add(word.substring(0, 1).toUpperCase() + word.substring(1));
        }

        return String.join(" ", list);


    }

}