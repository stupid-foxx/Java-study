import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);


/* PRINT HELLO WORLD 10 TIMES

        int counter=0;
        while(true){
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("Printed hw 10 times");
*/


/* PRINT NUMBER FROM 1 TO 10


        int counter=1;
        while(counter<=10){
            System.out.println(counter);
            counter++;
        }
*/

/* PRINT NUMBER FROM 1 TO N
        
        System.out.print("Enter number n: ");
        int n=sc.nextInt();
        int counter=1;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
*/



/* PRINT SUM OF FIRST N NATURAL NUMBERS


        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        int counter=1;
        int sum=0;
        while(counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println(sum);

*/


/* PRINT HELLO WORLD 10 TIMES IN FOR LOOP


        for(int counter=0; counter<10; counter++){
            System.out.println("Hello World");
        }
*/




/* PRINT SQUARE PATTERN


        for(int lines=1; lines<=4; lines++){
            System.out.println("****");
        }
*/


/* PRINT REVERSE OF A NUMBER


       int n=10899;

       while(n>0){
       int last_digit = n%10;
       System.out.print(last_digit);
        n = n/10;
       } 
       System.out.println();

*/



/* REVERSE THE NUMBER AND SAVE THE VALUE 

     int n=10899;
     int rev=0;

     while(n>0){
        int lastdigit=n%10;
        rev=(rev*10)+lastdigit;
        n=n/10;

     }
     System.out.println(rev);

*/
   


/* PRINT HELLO WORLD 10 TIMES WITH DO-WHILE LOOP


     int counter=1;
     do{
        System.out.println("Hello World");
        counter++;
     }while(counter <=10);


 */

     
/* BREAK STATEMENT

     int counter =0;
     for(int i=0; i<=5; i++){
        if(i==3){
            break;
        }
        System.out.println(i);
     }
     System.out.println("Imma outta loop");

*/


/*   KEEP ENTERING NUMBERS TILL USER ENTERS A MULTIPLE OF 10


     do{
     System.out.print("Enter your number: ");
     int n = sc.nextInt();
     if((n%10)==0){
        System.out.println("Got a multiple of 10");
        break;
     }
     System.out.println(n);
     } while(true);
     
*/



/* CONTINUE STATEMENT


     for(int i=0; i<=5; i++){
        if(i==3){
            continue;
        }
        System.out.println(i);
     }
*/


/*  DISPLAY ALL USER NUMBER EXCEPT MULTIPLE OF 10


     do{
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        if((n%10)==0){
            continue;
        }
        System.out.println(n);
     }while(true);

*/


/* CHECK IF PRIME OR NOT


     System.out.print("Enter your number: ");
     int n=sc.nextInt();


     if(n==2){
        System.out.println("n is prime");
     }else{

        boolean isPrime=true;
        for(int i=2; i<=n-1; i++){
        if(n%i==0){    //n is a multiple of i(i!=1 or n)
            isPrime=false;
        }
     }
     if(isPrime==true){
        System.out.println("number is prime");
     }else{
        System.out.println("number is not prime");
     }

     }



*/  //CHECK IF PRIME(OPTIMIZED WAY)

     System.out.print("Enter your number: ");
     int n=sc.nextInt();


     if(n==2){
        System.out.println("n is prime");
     }else{

        boolean isPrime=true;
        for(int i=2; i<=Math.sqrt(n); i++){    //optimising 
        if(n%i==0){    //n is a multiple of i(i!=1 or n)
            isPrime=false;
        }
     }
     if(isPrime==true){
        System.out.println("number is prime");
     }else{
        System.out.println("number is not prime");
     }

     }



    }
}
