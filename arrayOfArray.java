import java.util.Scanner;

import java.util.Arrays;

public class arrayOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int row = 0 ; row<arr.length ; row++)
        {
            for(int col = 0 ; col<arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        sc.close();
    }
}
