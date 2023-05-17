public class bitManipulators {
    public static void main(String[] args) {
    //BITWISE OPERATORS
    //1. &(binary and)
    //2. |(binary or)
    //3. ^(binary xor)
    //4. ~(binary one's complement)
    //5. <<(binary left shift) --> SHIFT VALUES TO LEFT and insert zeroes to spaces occurred due to shifting 
    //6. >>(binary right shift) -->SHIFT VALUES TO Right and insert zeroes to spaces occurred due to shifting
    //SYNATX OF LEFT AND RIGHT SHIFT
    //NUMBER OPERATOR POSITION 
    //ex - 0101 << 1;   --> 1010
    //ex - 0101 >> 1;   --> 1010
        // int A = 5;
        // int B = 6;
        // System.out.println(A<<1);
        // System.out.println(B>>1);
        /*Manipulators functions 
        1.get --> getting value at any index
        2. set --> setting value to 1 if 0 and 1 if 1
        3.update --> 0 to 1 and 1 to 0
        4.clear --> setting to 0
*/

//getting value at any position
//logic : bitMask = 1<<i ---> here i is position 
//then AND = bitMask & value given

//QUESTION : GET THE 3rd BIT AT POSITION 2 OF NUMBER N = 0101
// int n = 5;
// int pos = 3;
// int bitMask = 1<<pos;
// if((bitMask & n)== 0)
// System.out.println("bit was zero");
// else
// System.out.println("bit was one");

//setting the bit
//logic : bitMask = 1<<i ---> here i is position 
//then OR = bitMask | value given

//QUESTION : SET THE 2ND BIT(POSITION 1) OF A NUMBER N = 0101
// int n = 5;
// int pos = 1;
// int bitMask = 1<<pos;
// int newNumber = bitMask | n ;
// System.out.println(newNumber);

//clearing the bit 
//logic : bitMask = 1<<i;
//operation : AND WITH NOT

//QUESTION : clear the 3rd bit (position 2)of n = 0101
// int n = 5 ;
// int pos = 2;
// int bitMask = 1<<pos;
// int newNumber = n & (~bitMask); 
// System.out.println(newNumber);

//updating the bit 
//logic : bitMask = 1<<i;
//opeartion = And with not if (0) else or if (1)

//QUESTION : UPDATE THE 2ND BIT (POS = 1) OF N = 0101 TO 1
// int n = 5 ; 
// int pos = 1;
// int bitMask = 1<<pos;
// int newNumber = n | bitMask;
// System.out.println(newNumber);

// //QUESTION : UPDATE THE 1st BIT (POS = 0) OF N = 0101 TO 0
// int n1 = 5 ; 
// int pos1 = 0;
// int bitMask1 = 1<<pos1;
// int newNumber1 = n1 &(~bitMask1);
// System.out.println(newNumber1);
// int n = 10;
// System.out.println(n>>1);


int a = 5;
int b = 10;
int res = a&b;
System.out.println(Integer.toBinaryString(a));
System.out.println(Integer.toBinaryString(b));
System.out.println(Integer.toBinaryString(res));

    }
}
