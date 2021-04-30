package Oleh.Shevchenko;

public class Main {
    public static final int HOURS = 24;
    public static final int MINUTES = 60;


    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < HOURS ; i++) {
            for (int j = 0; j < MINUTES ; j++) {
                if (i / 10 % 10 == j % 10 && i % 10 == j / 10 % 10 ) {
                    count ++;
                }

            }
        }
        System.out.println(count);
    }
}
