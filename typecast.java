import java.util.*;
public class typecast{
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        //float a=25.12f; 
        //int b= (int) a;  //type casting 
        // System.out.println(b);
              //output=25 cuz int omit everything after decimal.
        
        //*IMP: Gives the ASCII no. of a charecter
        /*
        char ch='a';
        char ch2='b';
        int number = ch;
        int number2=ch2;
        System.out.println(number);
        System.out.println(number2); 
        */   

//TYPE PROMOTION - type1: (byte,short,char -> integer [only while evaluating])

       char a='a';
       char b='b';
       System.out.println((int)(b));
       System.out.println((int)(a));
       System.out.println(a);  // -> won't be converted to integer.Type promotion only occur with operations(+,- etc)

       //char c =a+b;  -> Shows error cuz a,b has already been converted to integer.


       System.out.println(b-a);

//TYPE PROMOTION - type2: {If there is long,float,double then all type -> long/float/double(the largest of them)}
       /*
       int a= 10;
       float b= 20.25f;
       long c=25;
       double d=30;
       double ans= a+b+c+d;
       System.out.println(ans);

       ->OUTPUT: 85.25 (in double)
       [Got converted to double, couldn't be calculated with integer or others]
       */
      

//Another Example
     /* WRONG
     byte b=5;
     byte a=b*2;
     System.out.println(a);
        -> showing error cuz b already converted into integer in 1st line
        -> so it's showing that integer can't be converted into byte in the 2nd line

     RIGHT (We typecast)
     byte b=5;
     byte a=(byte)(b*2);
     System.out.println(a);

     */

    }
}
