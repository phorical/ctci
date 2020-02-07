package ctci.strings;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testURLify {

    @DataProvider(name = "url")
    public static Object[][] urlProvider() {
        return new Object[][]{{"http://website.com/index.html?search=searching for a new thing to buy", "http://website.com/index.html?search=searching%20for%20a%20new%20thing%20to%20buy"},
                {"this_is_a_url_with_a_random space_in_it", "this_is_a_url_with_a_random%20space_in_it"}};
    }

    @Test(dataProvider = "url")
    public static void testURLify(String string1, String string2) {
        Assert.assertEquals(URLify.uRLify(string1), string2);
    }
}
