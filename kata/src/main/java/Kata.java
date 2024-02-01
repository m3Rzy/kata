public class Kata {
    public static void main(String[] args) {
        System.out.println(smash("hello", "world", "this", "is", "great"));
    }

    public static String smash(String... words) {
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sentence.append(words[i]);
            if (i < words.length - 1) {
                sentence.append(" ");
            }
        }
        return sentence.toString();
    }
}
