import java.util.*;
public class cs2{
    public static void main(String args[]){


/* Solution 1

        Scanner sc= new Scanner(System.in);
        System.out.println("Input number: ");
        int number=sc.nextInt();

        if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }

        */




/* Solution 2

       double temp=103.5;
       if(temp>100){
        System.out.println("You have fever");
       }
       else{
        System.out.println("You don't have fever");
       }

       */



/* Solution 3

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter week number: ");
     int week=sc.nextInt();
     switch(week){
        case 1: System.out.println("Sunday");
        break;
        case 2: System.out.println("Monday");
        break;
        case 3: System.out.println("Tuesday");
        break;
        case 4: System.out.println("Wednesday");
        break;
        case 5: System.out.println("Thursday");
        break;
        case 6: System.out.println("Friday");
        break;
        case 7: System.out.println("Saturday");

        default: System.out.println("Not weekly number");
     }

     */



/* Soulution 4

    output will be:
    x=false, y=63.
    */
   

   /*int a=78, int b=66, int c=45;

   int z=(a>b)? (a>c)? a:c:(b>c)? b:c ; */


   Scanner sc= new Scanner(System.in);
   System.out.print("Write year: ");
   int year=sc.nextInt();


   boolean x= (year%4) ==0;
   boolean y= (year%100)!=0;
   boolean z= (((year%100))==0 && ((year%400)==0));

   if(x && (y||z)){
    System.out.println("Leap year");
   }
   else{
    System.out.println("Not leap year");
   }



    }
}