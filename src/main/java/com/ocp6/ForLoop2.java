package com.ocp6;

public class ForLoop2 {

    public static void main(String[] args) {
        double[][] rows = {{170.0, 180.5, 165.3}, {60.4, 89.5, 41.2}};
        for (double[] s : rows) {
            for (double z : s) {
                System.out.println(z);
            }
        }
        System.out.println();
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                System.out.println(rows[i][j]);
            }
        }
    }

}
