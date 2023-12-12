package com.javaprogram;

public class TugasMateri3 {
    public static void main(String[] args) {


        for(int i =0; i<10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((j+i) == 9) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}