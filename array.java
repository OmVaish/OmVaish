import java.util.Scanner ;
public class array {
    public static void main(String[] args){
        // QUESTION : take an array as input from the user.
        // search for a given number x and print at which it occurs
       Scanner sc = new Scanner(System.in) ;
       System.out.print("ENTER SIZE OF A ARRAY : ");
       int size = sc.nextInt();

       int array[] = new int[size];
       for(int i = 0 ; i<size ; i++)
       {
           array[i] = sc.nextInt();
       }
//    System.out.print("ENTER X : ");
    //    int X  = sc.nextInt();
    //    for(int i = 0 ; i<size ; i++)
    //    {
    //        if(array[i] == X)
    //        System.out.println("INDEX IS : " + i);
    //    }

    // 2-D ARRAY
    // SYNTAX : TYPE NAME[][] = new type[row][col];
    // System.out.print("rows : ");
    // int rows = sc.nextInt();
    // System.out.print("columns : ");
    // int col = sc.nextInt();
    // int array[][] = new int[rows][col];
    // System.out.println("ENTER ELEMENTS(M * N) : ");
    
    // for(int i = 0 ; i<rows ; i++ )
    // {
    //     for(int j = 0 ; j<col ; j++)
    //     {
    //         array[i][j] = sc.nextInt();
    //     }
    // }
    // System.out.println("array is : ");
    // for(int i = 0 ; i<rows ; i++ )
    // {
    //     for(int j = 0 ; j<col ; j++)
    //     {
    //         System.out.print(array[i][j] + " ");
    //     }
    //     System.out.println();
    // }
    // array length
    //syntax : array_name.length
    System.out.println(array.length);
    //length is not a function as array is a class so its a object
       sc.close();
    }
}
