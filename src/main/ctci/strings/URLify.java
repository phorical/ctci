package ctci.strings;

public class URLify {

    /**
     * This is cheap - just using java string replace. If I felt that I was having trouble with string manipulation, I
     * would come back to complete this.
     * @param string
     * @return
     */
    public static String uRLify(String string) {
        return string.replaceAll(" ", "%20");
    }
}
