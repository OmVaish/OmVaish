// synatx in java : 
// public class class_name{
//     public static void main(String[] args){ 
//         statements ;
//     }
// } 
// import java.util.*;     //for taking input we include this package 
//we can also directly include scanner class instead of importing whole package like : 
//  import java.util.Scanner ;

public class first{
    // public static void print_Name(String name) //function declared and defined 
    //     {
    //         System.out.println("YOUR NAME IS " + name);
    //         return ;
    //     }
    //     public static double sum(double x , double y) {
    //         double sum = x+ y;
    //     return sum;
    //     }
    //for printing System.out.print("") we can use shortcut that is sout 
    //we can simply write sout and press enter that statement will be automatically printed
    public static void main(String[] args) 
    {
        // System.out.print("LINE 1 WILL BE PRINTED .");  
        // System.out.print(" LINE 2 WILL BE PRINTED IN SAME LINE");
        // //print() is used to print next statement in a single line

        // System.out.println();
        // A SINGLE LINE SPACE WILL BE PRINTED
        // System.out.println();
        // ONE MORE LINE SPACE WILL BE PRINTED

        // System.out.println("LINE 1 WILL BE PRINTED . ");
        // System.out.println("LINE 2 WILL BE PRINTED IN NEXT LINE");
        // println() function allows us to print next statement in new line

        // System.out.println();
        // A SINGLE LINE SPACE WILL BE PRINTED
        // System.out.println();
        // ONE MORE LINE SPACE WILL BE PRINTED

        // System.out.print("USING NEW LINE CHARACTAR i.e. (backslash n ) \n");
        // System.out.print("THIS LINE WILL BE PRINTED IN NEXT LINE \n");
        // //HERE \n IS USED FOR INSERTING A NEW LINE AFTER PRINTING OF THAT STATEMENT 

        // HOW TO RUN IN CMD
        // STEP 1 : cd path --> where file is stored
        // STEP 2 : javac file_name.java --> here javac invokes compiler that will compile the code 
        // STEP 3 : java file_name -->here java executer will execute the code and present output on screen

        //variables 
        // String name = " OM "; //declaration and definition of a variable
        // name = "OM VAISH" ; //changing value assigned to name variable
        // System.out.println(name);
        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);

        //TAKING INPUT
        // We have to use predefined class Scanner for taking input 
        // For this we need to import a package  but there no use till now 
        // Syntax for importing a package is : import java.util.* ; or import java.util.Scanner ;
        // Importing of a file is done before class
       
        // System.out.print("NAME : ");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // print_Name(name);      //function called
        // System.out.print("VALUE OF X : ");
        // double x = sc.nextDouble();
        // System.out.print("VALUE OF Y : ");
        // double y = sc.nextDouble();
        
        // System.out.print("SUM IS " + sum(x , y ));
        //  sc.close();
        //NOTE : whenever we use next() we can not print more than one word that is it will see first token only
        // SO TO RESOLVE THIS WE WILL USE nextLine function instead of next()
        
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        //here scanner class contains many more functions like
        //nextInt for taking integer input
        //nextFloat for taking float input
        //nextLine for taking whole string as input

        //QUESTION : TAKE TWO INPUT AND STORE THEM IN VARIABLES A AND B AND PRINT SUM
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum  =  a + b ;
        // System.out.println(sum);
        //  sc.close();    //object must be closed also

        //looping
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0 ; i<10 ; i++){
        // System.out.print("VALUE OF X IS : ");
        // System.out.println(i);
        // }
        // sc.close();

        // SWITCH : 
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // switch(n){
        //     case 1 :System.out.println("HELLO ");
        //     break ; 
        //     case 2: System.out.println("NAMASTE ");
        //     break;
        //     case 3:System.out.println("BONJOUR ");
        //     break;
        // }
        // sc.close();

        // WHILE CONDITION : 
        // int  i = 0;
        // while(i <= 10)
        // {
        //     System.out.println(n);
        //     i++ ;
        // }

        //DO - WHILE CONDITION
        // int i = 0;
        // do{
        //     System.out.print(i + " ");
        //     i++ ;
        // }
        // while(i<10);

        // SUM OF N NUMBERS : 
        // int n = 10 , sum= 0 , i = 0;
        // while(i<=n){
        //     sum += i;
        //     i++ ;
        // }
        // System.out.println(sum);

        //FUNCTION OR METHODS
        //SYNTAX : 
        //returnType func_name(type arg1 , type arg2 ...){
        //          operations / statements ;
        //}
        //arguments are inputs that are accepted by a function
        // these functions are stored in memory in form of stack 

        // how to know type of a variable
        // we use a boolean function that is hasNextInt()
        // it is accesed using object like object.hasNextInt();
        // if it is true it will print true and else false by default
        //  but we can use it as condition in if else loop to change output
        // System.out.print("ENTER ANY NUMBER : ");
        // Scanner sc = new Scanner(System.in);

        // if(sc.hasNextInt())
        // System.out.println("yes , number entered is an integer ");
        // else
        // System.out.println("number entered is not an integer");
        // sc.close();
        // TIME COMPEXITY 
        // It is a relation between input size and running time operations
        // time complexity <>< input  directly proportional
        // best case = omega(1)
        // average case = theta(n+1/ 2)
        // worst case = big O 

    }  
}