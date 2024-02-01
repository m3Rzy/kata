import java.util.List;

public class Kata {
    public static void main(String[] args) {
        Object[] arr = {1, "2", 3, "4", "5"};
        int s = sum(List.of(arr));
        System.out.println(s);
    }

    public static int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed) {
            if (element instanceof String) {
                sum += Integer.parseInt((String) element);
            } else if (element instanceof Integer) {
                sum += (int) element;
            }
        }

        return sum;
    }
}
