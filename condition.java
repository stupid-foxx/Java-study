import java.util.*;
public class condition{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        /* -> If-else statement

        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Vote");
        }
        if(age>13 && age<18){
            System.out.println("Juice");
        }
        else{
            System.out.println("Not adult");
        }
        */







       /*  -> Example
       int a=34;
       int b=23;
       if(a>=b){
        System.out.println("A is greater/equal to b");
       }
       else{
        System.out.println("b is grater than a");
       }
       */





      /*  ->Odd-even example

      int a=sc.nextInt();
      
      if(a%2==0 ){
        System.out.println("a is Even");
      }
      else{
        System.out.println("Odd");
      }
      */







     /* -> else if

     int age=13;
     if(age>=18){
        System.out.println("adult");
     }
     else if(age>=13 && age <18){
        System.out.println("Teenager");
     }
     else{
        System.out.println("Kid");
     }
     */







/* TAX CALCULATOR

    int income=sc.nextInt();
    int tax;

    if(income<500000){
        tax=0;
    }
    else if(income>=500000 && income <1000000){
        tax=(int)(income*0.2);
    }
    else{
        tax=(int)(income*0.3);
    }

    System.out.println("Your tax is: "+tax);
    }

*/






/*  -> Largest of 3 numbers
int a=1,b=2,c=8;

if((a>b)&&(a>c)){
    System.out.println("a is greatest");
}
else if(b>c){
    System.out.println("b is greatest");
}
else{
    System.out.println("c is greatest");
}
*/







/* -> TERNARY OPERATOR

int number=4;

String type=((number%2)==0)? "even":"odd";
System.out.println(type);

*/

/*  ->Ternary operator example

int marks=sc.nextInt();
String result=(marks>=33)? "pass":"fail";
System.out.println(result);

*/







/*  ->SWITCH 

int number=2;
switch(number){
    case 1: System.out.println("Samosa");
    break;
    case 2: System.out.println("Burger");
    break;
    case 3: System.out.println("Mango Shake");
    break;
    default: System.out.println("We woke up");
}
*/








//CALCULATOR

System.out.println("Enter a: ");
int a = sc.nextInt();

System.out.println("Enter b: ");
int b = sc.nextInt();

System.out.println("Enter operator: ");
char operator= sc.next().charAt(0);

switch(operator){
    case '+':System.out.println(a+b);
    break;
    case '-':System.out.println(a-b);
    break;
    case '*':System.out.println(a*b);
    break;
    case '/':System.out.println(a/b);
    break;
    case '%':System.out.println(a%b);
    default: System.out.println("Operator not applicable");
}
}
}