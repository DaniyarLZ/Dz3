package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] dz3york = {3.6, -4.7, 9.8, -1.5, 2.5, -6.9, 7.4, -3.5, 1.0, 5.1, 1.3, 5.1, -6.4, 5.6, -0.7};
        boolean variant = true;
        int stroka = 0;
        double chisla = 0;
        for (double r : dz3york
        ) {
            if (r < 0) {
                variant = true;
                continue;
            } else if (variant && r > 0)
                chisla += r;
            stroka++;

        }
        System.out.println(chisla);
        System.out.println(stroka);
        System.out.println("среднее число" + chisla / stroka);

        for (int i = 0; i < dz3york.length; i++) {
            double n = dz3york[i];
            int a = i - 1;
            while (a >= 0 && n < dz3york[a]) {
                dz3york[a + 1] = dz3york[a];
                a--;
            }
            dz3york[a + 1] = n;
            System.out.println(Arrays.toString(dz3york));
        }
    }
}
