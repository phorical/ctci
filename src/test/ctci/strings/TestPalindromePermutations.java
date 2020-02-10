package ctci.strings;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPalindromePermutations {

    @DataProvider(name = "palindromes")
    public static Object[][] palindromeProvider() {
        return new Object[][]{{"abcba"},{"abccba"},{"aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz"},{"aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyz"}};
    }
    @DataProvider(name = "nonPalindromes")
    public static Object[][] nonPalindromeProvider() {
        return new Object[][]{{"abcbaQ"},{"abccbaQW"},{"aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzzQW"},{"aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzQW"}};
    }

    @Test(dataProvider = "palindromes")
    public static void testPalindromePermutations(String string) {
        Assert.assertTrue(PalindromePermutation.palindromePermutation(string));
    }

    @Test(dataProvider = "nonPalindromes")
    public static void testNonPalindromePermutations(String string) {
        Assert.assertFalse(PalindromePermutation.palindromePermutation(string));
    }
}
