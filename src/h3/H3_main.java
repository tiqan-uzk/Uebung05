package h3;

public class H3_main {
    public static void main(String[] args) {
        int[][] einheiten = new int[2][15];

        einheiten[0][0] = 50000;
        einheiten[0][1] = 20000;
        einheiten[0][2] = 10000;
        einheiten[0][3] =  5000;
        einheiten[0][4] =  2000;
        einheiten[0][5] =  1000;
        einheiten[0][6] =   500;
        einheiten[0][7] =   200;
        einheiten[0][8] =   100;
        einheiten[0][9] =    50;
        einheiten[0][10] =   20;
        einheiten[0][11] =   10;
        einheiten[0][12] =    5;
        einheiten[0][13] =    2;
        einheiten[0][14] =    1;

        int input = 6279;

        int rest = input;
        for (int i = 0; i < einheiten[0].length; i++) {
            if (rest >= einheiten[0][i]) {
                einheiten[1][i] = rest / einheiten[0][i]; // Anzahl der Stücke
                rest = rest % einheiten[0][i];            // Restbetrag
            }
        }
    }
}
