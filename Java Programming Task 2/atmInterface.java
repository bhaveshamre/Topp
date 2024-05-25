





import java.util.*;

class atmInterface{
 private static Scanner sc = new Scanner(System.in);
 private static boolean exit = false;

private static HashMap<Integer, Integer> accounts = new HashMap<>();
private static HashMap<Integer, Float> balances = new HashMap<>();

private static void initializeAccounts(){
accounts.put(123456,1234);
balances.put(123456,10000.1567f);

accounts.put(702160,1234);
balances.put(702160,1567.00f);
}

private static boolean authenticate(int accountno, int pin){
return accounts.containsKey(accountno) && accounts.get(accountno).equals(pin);
} 


//////
private static void Withdraw(){
        System.out.println("Enter Your Account No.:");
        int accountno = sc.nextInt();
        System.out.println("Enter Your PIN:");
        int pin = sc.nextInt();

        if (authenticate(accountno,pin)) {
            System.out.println("Enter amount to withdraw: ");
            float amount = sc.nextFloat();
            if (amount > 0 && balances.get(accountno) >= amount) {
                balances.put(accountno, balances.get(accountno) - amount);
                System.out.println("Your Money has been successfully Withdrawn which is RS :"+ amount);
            } else {
                System.out.println("Invalid amount or insufficient funds.");
            }
        }
        else{
            System.out.println("Invalid Account NO. or Password");
        }
}



//////
private static void Deposit(){
        System.out.println("Enter Your Account No.:");
        int accountno = sc.nextInt();
        System.out.println("Enter Your PIN:");
        int pin = sc.nextInt();

        if (authenticate(accountno,pin)){
            System.out.println("Enter amount to Deposit: ");
            float amount=sc.nextFloat();

if(amount > 0){
balances.put(accountno,balances.get(accountno)+amount);
System.out.println("Your Money has been successfully Diposited which is RS :"+ amount);
}

else {
                System.out.println("Invalid amount. Kindly enter a positive amount !");
}
}
else{
            System.out.println("Invalid Account NO. or Password");
}
}



/////////
private static void Balance(){
        System.out.println("Enter Your Account No.:");
        int accountno = sc.nextInt();
        System.out.println("Enter Your PIN:");
        int pin = sc.nextInt();

if (authenticate(accountno,pin)){
            System.out.println("Your Account Balance is "+balances.get(accountno));
        }
else{
            System.out.println("Invalid Account NO. or Password");
        }
}



////////
private static void Exit(){
exit = true;
System.out.println("Thank you for using the ATM. Goodbye !");
System.out.println("");
}


////
public static void main(String[] args){
        initializeAccounts();

        System.out.println("ATM Machine");
        System.out.println("");

        while(!exit) {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");

            int choice = sc.nextInt();
            System.out.println("Choose the operation:" + choice);
            switch (choice) {

                case 1:
                    Withdraw();
                    break;

                case 2:
                    Deposit();
                    break;

                case 3:
                    Balance();
                    break;

                case 4:
                    Exit();
                    break;

                default:
                    System.out.println("Invalid Choice. !  Please try again. !");
            }
        }
    }
}

