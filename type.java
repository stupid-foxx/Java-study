import java.util.*;
public class type{
    public static void main(String args[]){
        //int a =2;      -> Int to double is possible
        //double b=a;

        //double a=3;   -> Double to Int is not possible
        //int b=a;

        Scanner sc= new Scanner(System.in);
        //int number = sc.nextFloat();     ->ERROR
        float number = sc.nextInt();    // -> ALLOWED
        System.out.println(number); 
    }
}
