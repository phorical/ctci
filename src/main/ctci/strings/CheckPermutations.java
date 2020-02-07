package ctci.strings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CheckPermutations {
    public static boolean checkPermutations(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] sort1 = string1.toCharArray();
        char[] sort2 = string2.toCharArray();
        Arrays.sort(sort1);
        Arrays.sort(sort2);
        for (int i = 0; i < sort1.length; i++) {
            if (sort1[i] != sort2[i]) {
                return false;
            }
        }
        return true;
    }
}
