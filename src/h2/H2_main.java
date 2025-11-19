package h2;

public class H2_main {

    public static void main(String[] args) {
        int n = 48889;
        int digits = 5;

        int[] a = new int[9];

        digits = 0;
        a = new int[9];

        if(n == 0) {
            digits = 1;
        }else {
            int tmp = n;
            while (tmp > 0) {
                digits++;
                tmp /= 10;
            }
        }

        int index = 8;
        int tmp = n;

        if(tmp == 0) {
            a[index] = 0;
        } else {
            while (tmp > 0 && index >= 0) {
                a[index] = tmp % 10;
                tmp /= 10;
                index--;
            }
        }

//        System.out.println(Arrays.toString(a));
//        System.out.println(digits);

    }
}
