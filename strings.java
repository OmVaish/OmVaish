import java.util.Arrays;

//import java.util.Scanner;

public class strings {
    // String named class is already there in java therfore we can not use this name 
    //hence I have used strings name
    public static String Change(String name) {
        name = " VARUN SANGAI ";
        return name;
    }
    public static void main(String[] args){

    // String declaration
    // String name = "Tony";

    //String input
    // Scanner sc =  new Scanner(System.in);
    // System.out.print("ENTER NAME : ");
    // you cannot change string , you can make copy and then change
    // String name = sc.next();
    // System.out.print("ENTER A LINE : ");
    // String nm = sc.nextLine();

    // System.out.println(name + " " +nm);
    // DIFFERENT WAYS TO PRINT : 
    // 1. print()
    // 2. println()
    // 3. printf or format() : both do same work
    // example
    // int a = 6; 
    // double b = 2.3553343223223324324233234244 ;
    // System.out.format("The value of a is %d and value of b is %d", a, b);
    // here % is called format specifier 
    // %d for int and double , %f for float , %c for char and %s for string 
    // System.out.println();
    // System.out.printf("%d , %f and %d" , a, b);

    // string methods and functions name  : 
    
    // String name = "Harry" ;
    // 1.name.length() --> returns length of a string
    // System.out.println(name.length());
    
    // 2.name.toLowerCase() --> return new string with all lowercase
                              //letters from a string name
    //System.out.println(name.toLowerCase());
    
    //  3.name.toUpperCase -->return new string with all uppercase
                              //letters from a string name
    // System.out.println(name.toUpperCase());  
    
    //  4.name.trim() --> returns new string after removing all 
                          //leading and trailing spaces
    // String trim = "     POTTER " ; 
    // System.out.println(trim.trim());  
    
    // 5.name.substring(int start) --> prints new string from index given to end
    //String sub = "HARRY POTTER ";
    // System.out.println(sub.substring(5));  
    //here sub is name , substring is a function and 5 is parameter that is index number   
    
    //if ending index is n then it will find till n-1 index not till n
    //and is=f ending index is not given then it is tskrn by default till end
    //6.name.substring(int start , int end) --> same but here we can give start and end points both
    // System.out.println(sub.substring(3, 5));
    
    //7.name.replace('a' , 'b') -->replaces first character given with another character
    // System.out.println(sub.replace('A' , 'F'));
    
    //8.name.replace("AB" , "BC") --> replacing a string with another string
    // System.out.println(sub.replace("HARRY" , "BEST"));
    
    //9.name.startsWith("HA") --> returns true if name starts with HA
    // System.out.println(sub.startsWith("HA"));
    
    //10.name.endsWith("ER") -->returns true if name ends with ER
    // System.out.println(sub.endsWith("ER"));
    
    //11.name.charAt(int index) --> retuns char present at index given
    // System.out.println(sub.charAt(3));
    
    //12.name.indexOf(char 's') --> retuns index where given char / string is present
    // System.out.println(name.indexOf("rr"));
    // System.out.println(name.indexOf('a'));
    //note : this will retun a single index where that char or string comes first
    
    //13. name.indexOf(str "s", int 3) --> returns index where given string occurs first starting from
                                        //given index
    //System.out.println(name.indexOf('r' , 3));
    //note : it will retun -1 if it does not found any match

    //14. name.lastIndexOf("s") --> returns last occurence of given char/string
    //System.out.println(name.lastIndexOf("r"));
    
    //15. name.lastIndexOf("S" , 2) --> returns last occurence of given char/string before given index
    //System.out.println(name.lastIndexOf("r" , 3));

    //16. name1.compareTo(name2) --> it is a boolean statement used in decission making statements
    //if s1 > s2--> returns any positive value
    //if s1 = s2 --> returns 0
    //iif s1 <s2 --> returns any negative value

    //17.Integer.parseint(string) --> returns integer  strored in that string

    //18. Integer.toString(num) --> converts int type to string
    // int num = 123;
    // System.out.println(Integer.toString(num));

    //19. Double.toString(num) --> converts double  to string
    // double num1 = 123;
    // System.out.println(Double.toString(num1));

    //17.Double.parseDouble(string) --> returns double strored in that string
    // String n = "5646.56";
    // System.out.println(Double.parseDouble(n));

    // String[] arr = new String[5];
    // arr[0] = "Varun";
    // arr[1] = "om gupta";
    // arr[2] = "om vaish";
    // arr[3] = "prakhar";
    // arr[4] = "Rituraj";
    // System.out.println(Arrays.toString(arr));
    //Arrays.toString(obj) is used for printing full array in precise manner
    //also importing java.util.Arrays
    //like : [a, b ,c , d , e] -->including ([ ] ),(,) 
    int[][] arr = {{1,2,3} , {4,5,6} , {7,8,9}};
    System.out.println(Arrays.toString(arr));

    // sc.close();
}  
} 