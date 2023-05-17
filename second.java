// import java.util.Scanner ;

public class second{
    // public static void greatest_divisor(int n1 , int n2){
    //     int max = 1 ;
    //     int min = n2;
    //     if(n1<=n2)
    //     min = n1;

    //      for(int i = 2; i<=min ; i++)
    //         {
    //             if(n1 % i == 0 && n2 % i == 0)
    //             {
    //             max = i ;
    //             }
    //         }
        
    //     System.out.println(max);
    //     return ;
    // }
     public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // greatest_divisor(n1, n2);
        // sc.close();

        // ARRAYS DEFINITION : 
        // SYNTAX : 
        // type[]array_name = new type[size]; OR 
        // type array_name[] = new type[size] ;
        // here we are just defining array and initialising members later on 
        // but we can define and initialise at the same time  ::
        // SYNTAX : 
        // type array_name[] = { elements }

        // INITIALISATION OF ELEMENTS 
        // array_name[index-no.] = value ;
        // example : 
         int[] marks = new int[4];
         marks[0] = 80 ; 
         marks[1] = 45 ;
         marks[2] = 90 ; 
        // marks[3] = 85 ;
         System.out.println(marks[3]);
        // int age[] = {24 , 22 ,18} ;
        // System.out.println(age[1]);

        // by defualt in java whenever we create a variable in array it automatically stores a null value
        // for int type 0 is stored
        // for bool false , for string " " , for float 0.0
        // like we done it in array marks , ther we stored 3 elements but one was not initialised
        // so , by default java has initialised it to 0
        
        return ;
    }
}