package ctci.strings;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testCheckPermutations {

    @DataProvider(name = "not-perms")
    public static Object[][] notPermsProvider() {
        return new Object[][]{{"string1", "string2"}, {"s", "t"}, {"abc", "123"}};
    }

    @DataProvider(name = "permutations")
    public static Object[][] permutationsProvider() {
        return new Object[][]{{"abc","cba"},{"abcdefghijklmnopqrstuvwxyz","zyxwvutsrqponmlkjihgfedcba"},{"123","123"}};
    }

    @Test(dataProvider = "not-perms")
    public static void testNotPerms(String str1, String str2) {
        Assert.assertFalse(CheckPermutations.checkPermutations(str1, str2));
    }

    @Test(dataProvider = "permutations")
    public static void testPermutations(String str1, String str2) {
        Assert.assertTrue(CheckPermutations.checkPermutations(str2, str2));
    }
}
