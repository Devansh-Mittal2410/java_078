package Unit_3.ArrayList;

import java.util.Scanner;

public class Matrix_add {
    public static void main(String[] args) {
        int a[][] = new int [2][3];
        int b[][] = new int [2][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first array : ");
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Input second array : ");
        for(int i = 0 ; i < b.length ; i++){
            for(int j = 0 ; j < b[i].length ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output array : ");
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print((a[i][j]+b[i][j]) + " ");
            }
            System.out.println();
        }

    }
}
