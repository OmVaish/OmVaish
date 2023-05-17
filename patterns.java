//import java.util.Scanner;

public class patterns {
    public static void main(String[] args){
    // Q1 : PRINT THE PATTERN
    //     * * * * *
    //     * * * * *
    //     * * * * *
    //     * * * * *
    int n = 4;
    for(int i = 0 ; i<n ; i++)
    {
        for(int j = 0 ; j<n+1 ; j++){
        System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println("Q2 PATTERN : ");

    // Q2 : PRINT THE PATTERN
    //     * * * * *
    //     *       *
    //     *       *
    //     * * * * *
    for(int i = 0 ; i<4 ; i++){
    if(i == 0 || i == 3)
    {
        for(int j = 0 ; j< 5 ; j++)
        {
            System.out.print("* ");
        }
    }
    else{
        for(int j = 0 ; j<5 ; j++)
        {
            if(j == 0 || j == 4)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
    }
        System.out.println();
    }
    System.out.println("Q3 PATTERN : ");

    // Q3 : PRINT THE PATTERN
    //     * 
    //     * *
    //     * * *
    //     * * * *
    for(int i = 0 ; i< 4 ; i++)
    {
        for(int j  = 0 ; j<= i ; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("Q4 PATTERN : ");

    // Q4 : PRINT THE PATTERN
    //     * * * * 
    //     * * *
    //     * * 
    //     *
    for(int i = 0 ; i< 4 ; i++)
    {
        for(int j  = n ; j>i ; j--)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("Q5 PATTERN : ");

    // Q5 : PRINT THE PATTERN
    //          * 
    //        * *
    //      * * *
    //    * * * * 
    for(int i = 0 ; i< 4 ; i++)
    {
        for(int j  = 0 ; j<n ; j++)
        {
            if(j>=n-1-i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }

    System.out.println("Q6 PATTERN : ");

    // Q6 : PRINT THE PATTERN
    //     1 
    //     1 2
    //     1 2 3
    //     1 2 3 4
    for(int i = 0 ; i< 4 ; i++)
    {
        for(int j  = 0 ; j<= i ; j++)
        {
            System.out.print(j+1);
        }
        System.out.println();
    }
    System.out.println("Q7 PATTERN : ");

    // Q7 : PRINT THE PATTERN
    //     1 2 3 4 5
    //     1 2 3 4 
    //     1 2 3
    //     1 2
    //     1
    for(int i = 0 ; i< 4 ; i++)
    {
        for(int j  = 0 ; j<n-i; j++)
        {
            System.out.print(j+1);
        }
        System.out.println();
    }
    System.out.println("Q8 PATTERN : ");

    // Q8 : PRINT THE PATTERN
    //     1 
    //     2 3
    //     4 5 6
    //     7 8 9 10
    int v = 1;
    for(int i = 0 ; i< 4 ; i++)
    {
        for(int j  = 0 ; j<= i ; j++)
        {
            System.out.print(v);
            v++  ;
        }
        System.out.println();
    }
    System.out.println("Q9 PATTERN : ");

    // Q9 : PRINT THE PATTERN
    //     1 
    //     0 1
    //     1 0 1
    //     0 1 0 1
    int s = 5;
    for(int i = 0 ; i< s ; i++)
    {
        for(int j  = 0 ; j<= i ; j++)
        {
            if((i+j) % 2 == 0)
            System.out.print(1);
            else
            System.out.print(0);
        }
        System.out.println();
    }
    System.out.println("advanced pattern : ");
    // butterfly pattern
    // *                 *
    // * *             * *
    // * * *         * * *
    // * * * *     * * * *
    // * * * * * * * * * *
    // * * * * * * * * * *
    // * * * *     * * * *
    // * * *         * * *
    // * *             * *
    // *                 *
    int nine  = 10;
    for(int i = 1 ; i<=nine ; i++)
    {
        if(i<=nine/2){
        for(int j = 1 ; j<=nine-1 ; j++)
        {
            if(j<= i || j>(nine-1)-i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    else{
        for(int j = 1 ; j<=nine-1 ; j++)
        {
            if(j> i || j<=(nine-1)-i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    }
    System.out.println("next pattern : ");
    //         * * * * *
    //       * * * * *
    //     * * * * *
    //   * * * * *
    // * * * * *
    n = 5;
    for(int i = 1 ; i<n ; i++)
    {
        for(int j = 1 ; j<2*n-1 ; j++)
        {
            if(j<n-i || j>2*n-1-i)
            System.out.print("  ");
            else
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println("next pattern : ");
    //     1   
    //    2 2 
    //   3 3 3  
    //  4 4 4 4
    // 5 5 5 5 5
    n = 5;
    for(int i = 1 ; i<=n ; i++)
    {
        for(int j = 1 ; j<=n ; j++)
        {
            if(j<=n-i || j>2*n-i)
            System.out.print(" ");
            else
            System.out.print(i + " ");
        }
        System.out.println();
    }
    System.out.println("next pattern : ");
    //         1   
    //       2 1 2 
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    n = 5 ;
    for(int i = 1 ; i<=n ; i++)
    {
        for(int k = 1 ; k<=n-i ; k++)
        {
            System.out.print(" ");
        }
        for(int j = i ; j>=1 ; j--)
        {
            System.out.print(j);
        }
        for(int j = 2 ; j<=i ; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    System.out.println("last pattern : ");
    //       *
    //     * * *
    //   * * * * *
    // * * * * * * *
    //   * * * * *
    //     * * *
    //       *
    n = 4 ;
    for(int i = 1 ; i<=n ; i++)
    {
        for(int j = 1 ; j<= n-i ; j++)
        {
            System.out.print("  ");
        }
        for(int j  = 1 ; j<=2*i-1 ; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i = n ; i>=1 ; i--)
    {
        for(int j = 1 ; j<= n-i ; j++)
        {
            System.out.print("  ");
        }
        for(int j  = 1 ; j<=2*i-1 ; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    // star pattern 
        // *               *
        // * *           * *
        // * * *       * * *
        // * * * *   * * * *
        // * * * * * * * * *
        System.out.println("my favourite pattern ");
        n = 5 ;
        for(int i = 0 ; i < n; i++ )
        {
            for(int j = 0 ; j<2*n-1 ; j++)
            {
                if(j <= i || j >= (2*n - 2) - i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        //star pattern 
        //   * * * * *
        //    * * * *  
        //     * * *
        //      * *
        //       *

        System.out.println("ONE MORE PATTERN ");
        int x = 5;
        for(int i = 0 ; i< x ; i++)
        {
            for(int k = 0 ; k <= i ; k++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < x-i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
