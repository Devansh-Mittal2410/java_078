package Unit_3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int a1[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < a1.length ; i++){
            a1[i] = sc.nextInt();
        }
    }
}
