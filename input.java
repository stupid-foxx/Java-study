import java.util.*; //import this package for taking user input

public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
          //Scanner object
          //could have any name instead of sc after Scanner, S caps.
          //Compulsury everytime we take input.
          //System.in for input is like System.out for printing output.
          //sc. -> to be used before every next to make it take inputs.

       // String input = sc.next(); 
          //next captures the word in CLI
          // -> next() ignores everything after space or in new line.
    
       //String name =sc.nextLine();  
       //System.out.println(name);
          // -> nextline() includes spaces and nextlines.
          // Used for input of full name.
          //L in line caps


      int number = sc.nextInt();
      System.out.println(number);
         // -> nextInt() used for input of numbers.
         //I in int caps.

      float price= sc.nextFloat();
      System.out.println(price);
         //For float

       
    }
}

//TYPES OF INPUT
//syntax: sc.next_
/*
next
nextLine
nextInt
nextByte
nextFLoat
nextDouble
nextBoolean
nextShort
nextLong
*/