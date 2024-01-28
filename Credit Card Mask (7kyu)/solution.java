public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) return str;

        return mask(str.length() - 4) + str.substring(str.length() - 4, str.length());

    }

    private static String mask(int length) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < length; i++) res.append("#");

        return res.toString();
    }
}