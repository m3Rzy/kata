public class Kata {
    public static void main(String[] args) {
        Boolean[] c = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println(countSheeps(c));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != null && arrayOfSheep) {
                count++;
            }
        }
        return count;
    }
}
