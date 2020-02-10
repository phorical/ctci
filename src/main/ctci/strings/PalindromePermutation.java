package ctci.strings;

import java.util.Arrays;

public class PalindromePermutation {

    public static boolean palindromePermutation(String string) {
        boolean foundOddNumber = false;
        System.out.println(string);
        char[] sort = string.toCharArray();
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++) {
            int count = 0;
            while ((i + count < sort.length) && (sort[i] == sort[i+count])) {
                count++;
            }
            if (count % 2 != 0) {
                if (foundOddNumber) {
                    return false;
                } else {
                    foundOddNumber = true;
                }
            }
            i += count - 1;
        }
        return true;
    }
}
