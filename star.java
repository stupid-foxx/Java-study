import java.util.*;
public class star{
    public static void main(String args[]){
        
 
 /*. PRINT STAR PATTERN


        for(int lines=1; lines<=4; lines++){
            for(int stars=1; stars<=lines; stars++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

*/

/* PRINT INVERTED-STAR PATTERN


        for(int lines=1; lines<=4; lines++){
            for(int stars=lines; stars<=4; stars++){
                System.out.print("*");
            }
            System.out.print("\n");
        } 
*/ 


/* PRINT INVERTED-STAR PATTER 2


        for(int line=1; line<=4; line++){
            for(int star=1; star<= 4-line+1; star++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
*/      


/*  PRINT HALF-PYRAMID


        for(int lines=1; lines<=4; lines++){
            for(int numbers=1; numbers<=lines; numbers++){
                System.out.print(numbers);
            }
            System.out.print("\n");
        }



*/ 
// PRINT A CHARECTER PYRAMID  

        
        char ch='A';
        for(int lines=1; lines<=4; lines++){
            for(int charecter=1; charecter<=lines; charecter++){
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
        }
        }
    }
