package ctci.strings;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestIsUnique {

    @DataProvider(name = "unique")
    public static Object[][] uniqueProvider() {
        return new Object[][]{{"abcdefghijklmnopqrstuvwxyz"}, {"abc"}, {"xyz"}, {"123"}};
    }

    @DataProvider(name = "non-unique")
    public static Object[][] nonUniqueProvider() {
        return new Object[][]{{"aa"}, {"abcabc"}, {"xyzzyx"}, {"abc123xyz890a"}};
    }

    @Test(dataProvider = "unique")
    public static void testIsUnique(String string) {
        Assert.assertTrue(IsUnique.isUnique(string));
    }

    @Test(dataProvider = "non-unique")
    public static void testIsNotUnique(String string) {
        Assert.assertFalse(IsUnique.isUnique(string));
    }
}
