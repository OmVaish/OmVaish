import java.util.*;
public class raise2Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question : Check whether number is 2 raise to power or not
        int n = sc.nextInt();
        
        if((n & n-1) == 0 )//binary of any 2 raise to power is always having at right most
        //like 2 = 10 , 4 = 100 , 8 = 1000 , 16 = 10000
        //n-1 is always inverting rightmost 1 to 0 and rest bits in right to 1
        // 15 = 01111 
        System.out.println("YES");
        else
        System.out.println("NO");

        //Question : IF yes check power at which it is
        int a = (int)((Math.log10(n))/(Math.log10(2)));
        //Logic : log2(n) = a;
        //here a is power

        System.out.println(a); 

        //Question : Check position at which the rightmost bit is 1
        int n2 = n-(n & n-1) ;//20 == 10100 19 == 10011   20 & 19 == 10000 = 16
        int bit = (int)((Math.log10(n2))/(Math.log10(2)));
        System.out.println(bit);
        sc.close();
}
}