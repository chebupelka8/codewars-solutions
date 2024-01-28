public class FindOdd {
    public static int findIt(int[] array) {

        for (int i : array) {
            if (!(countInList(array, i) % 2 == 0)) return i;
        }

        return 0;
    }

    private static int countInList(int[] list, int target) {
        int res = 0;

        for (int i : list) {
            if (i == target) res += 1;
        }

        return res;
    }
}
