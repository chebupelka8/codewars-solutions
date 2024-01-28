public class SpinWords {

    public static String spinWords(String sentence) {
        StringBuilder res = new StringBuilder();

        for (String s : sentence.split(" ")) {
            if (s.length() >= 5) res.append(reversed(s));
            else res.append(s);

            res.append(" ");
        }

        return res.toString().trim();

    }

    private static String reversed(String str) {
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }
}
