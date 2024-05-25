





import java.util.*;
import java.io.*;

class numberGuessingGame{

public static void main (String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("");
System.out.println("Welcome to Guess Number Game");
System.out.println("");
System.out.println("You Will Be Asked To Guess A Number To Win The Game");
int n = 15;
System.out.println("You have Maximum "+n+" Attemp Limit");

System.out.println("");
Random random = new Random();
int correct = random.nextInt(100)+1;

for(int i=1;i<=n;i++){
System.out.println("Enter a guess number between 1 to 100");
int num = sc.nextInt();
if(num==correct){
System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
break;
}
else if (num>correct){
System.out.println("Your Guess Number is Greater.");
}
else if(num<correct){
System.out.println("Your Guess Number is Smaller.");
}

}
sc.close();
}
}



