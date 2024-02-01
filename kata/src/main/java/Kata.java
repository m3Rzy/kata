public class Kata {
    public static void main(String[] args) {
        System.out.println(repeatStr(3, "lol"));
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
