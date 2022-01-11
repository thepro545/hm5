package ru.skypro;

public class Main {

    public static void main(String[] args) {
// task 1
        int[] mass3 = new int[3];
        mass3[0] = 1;
        mass3[1] = 2;
        mass3[2] = 3;
        double[] doubleNum = {1.57, 7.654, 9.986};
        int[] boxSize = new int[6];
        boxSize[0] = 400;
        boxSize[1] = 600;
        boxSize[2] = 500;
        boxSize[3] = 1000;
        boxSize[4] = 2000;
        boxSize[5] = 1500;
// task 2
        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i]);
            if (i != mass3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleNum.length; i++) {
            System.out.print(doubleNum[i]);
            if (i != doubleNum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < boxSize.length; i++) {
            System.out.print(boxSize[i]);
            if (i != boxSize.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

// task 3
        for (int i = mass3.length-1; i >= 0; i--) {
            System.out.print(mass3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleNum.length-1; i >= 0; i--) {
            System.out.print(doubleNum[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = boxSize.length-1; i >= 0; i--) {
            System.out.print(boxSize[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

// task 4
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] % 2 != 0) {
                mass3[i] += 1;
                System.out.print(mass3[i]);
                if (i != mass3.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
