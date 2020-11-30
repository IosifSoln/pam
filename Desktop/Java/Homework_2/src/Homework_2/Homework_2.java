package Homework_2;

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        {
            int[] myArray = new int[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 0};
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == 1) myArray[i] = 0;
                else myArray[i] = 1;
                System.out.println(Arrays.toString(myArray));
            }
        }

//            2.2
        int[] myArray2 = new int[8];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i * 3;
            System.out.println(Arrays.toString(myArray2));

        }

//            2.3
        int[] myArray3 = new int[12];
        myArray3[0] = 1;
        myArray3[1] = 5;
        myArray3[2] = 3;
        myArray3[3] = 2;
        myArray3[4] = 11;
        myArray3[5] = 4;
        myArray3[6] = 5;
        myArray3[7] = 2;
        myArray3[8] = 4;
        myArray3[9] = 8;
        myArray3[10] = 9;
        myArray3[11] = 1;
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] < 6) myArray3[i] *= 2;

            System.out.println(Arrays.toString(myArray3));

        }


//        2.4
        int[][] myArray4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0, x = myArray4.length - 1; j < 5; j++, x--) {

                if (i == j || i == x) myArray4[i][j] = 1;
                else myArray4[i][j] = 0;
                System.out.print(myArray4[i][j] + " ");
            }
            System.out.print("\r\n");
        }

//            2.5


        int[] myArray5 = {12, 19, 6, 75, 9, 4876, 3};
        int min = myArray5[0];

        int max = myArray5[0];

        int NumberMin = 0, NumberMax = 0;
        for (int i = 0; i < myArray5.length; i++) {

            if (myArray5[i] < min) {
                myArray5[i] = min;
                NumberMin = i;
            } else if (myArray5[i] > max) {
                myArray5[i] = max;
                NumberMax = i;
            }
        }
        System.out.println("  максимальный элемент носит порядковый номер" + NumberMax);
        System.out.println(" минимальный элемент носит порядковый номер" + NumberMin);
//        2.6

    }

        private static boolean Nomber6(int[] myArray6) {

        int a = 0 , b = 0 ;

        for (int i = 0; i < myArray6.length; i++) {
            if (a == b) return true;


    }
        return false;
    }
//    2.7
public static void shift(int[]myArray7 , int n ) {
    for (int i : myArray7) System.out.print(i + " ");
    System.out.println("\r\n");

    if (n > 0) {
        for (int x = 0; x < n; x++) { int myArray71 = myArray7 [myArray7.length - 1];
            if (myArray7.length - 1 >= 0) System.arraycopy(myArray7, 0, myArray7, 1, myArray7.length - 1);
            myArray7[0] = myArray71 ;
        }
    }
    if (n < 0) {
        for (int x = 0; x > n; x--) {
            int myArray71 = myArray7[0];
            System.arraycopy(myArray7, 1, myArray7, 0, myArray7.length - 1);
            myArray7[myArray7.length - 1] = myArray71;
            for (int i : myArray7) System.out.print(i + " ");
            System.out.print("\r\n");
}
    }
    }
}







