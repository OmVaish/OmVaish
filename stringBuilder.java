public class stringBuilder {
    public static void main(String[] args) {
    //As Strings are immutable that is you can't modify any string once created
    //if you want to modify, another string is created and previous string is deleted 
    //ex- step 1 : string str = "h";
    // str + "e ";
    //string str = " he "; //"h" is deleted and new string "he" is stored
    //that process of new string is time taking due to which program running take time
    //to solve thiss we have more optimised string class 
    //and that is StringBuilder class

    //this class is used to modify any string without taking much time
    //for operations on string we don't use strings , we use stringbuilder class

    //WHY STRINGS ARE IMMUTABLE ?
    //there are two forms of storing 
    //1. Stack -- where variable is stored
    //2.heap --where value is stored 
    //in this variable of stack points towards heap value

    //now in strings when we want to add , it add character one by one and creating new string each time 
    //but in stringsbuilder it create one string and then new charachter is added to same
    /*
    FOR STRINGS
    STACK    |     HEAP
    str -------> h
    str -------> he //previous one deleted in each case
    str -------> hel
    str -------> hell
    str -------> hello
    here str is pointing to h first , then pointing to he
    and previous h is deleted and then repeating same until hello
    */

    /*
    FOR STRINGBUILDER
    STACK                |    HEAP
    str -------> "h"--> "he" --> "hel" 
    here same string "h" is modified and str is pointing to same string
    here no creation is done is heap , therefore it is not time taking
    */

    //Decalaration
    //StringBuilder sb = new StringBuilder("WHATAEVER STRING YOU WANT TO PASS");
    //here sb is object but in one way it is string name of type StringBuilder
    StringBuilder sb = new StringBuilder("TONY STARK");
    System.out.println(sb);
    System.out.println(sb.charAt(3));
    
    //in stringbuilder we can also add any new char at particular index and remove previous char
    //function used is : setcharAt(i)
    //System.out.println(sb.setCharAt(0, 'M')); //this statement is wrong
    //because it only change string , you have to write change and print in another statemnet
    sb.setCharAt(0, 'M');//modifying
    System.out.println(sb);//printing

    //for inserting any char : insert(index, char)
    sb.insert(2, "U" );
    System.out.println(sb);

    //deleting a substring or char : delete(from, to)
    sb.delete(5, sb.length());
    System.out.println(sb);
    sb.delete(2, 3);
    System.out.println(sb);

    sb.setCharAt(0, 'T');
    System.out.println(sb);

    //append(inserting at last) --> append(str)
    sb.append(" STARK");
    System.out.println(sb);
    /*
    line 71 do same work as
    sb.append(" ");
    sb.append("S");
    sb.append("T");
    sb.append("A");
    sb.append("R");
    sb.append("K"); 
    
    in strings we write str = str + " ";
    str = str + "h"; respectively
    where new string is created
    */
    
}
}
