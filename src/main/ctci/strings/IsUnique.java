package ctci.strings;

public class IsUnique {
    public static boolean isUnique(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            char c = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == c) {
                    return false;
                }
            }
        }
        return true;
    }
}
