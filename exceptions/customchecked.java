

//Custom checked exception
class withdrawException extends Exception {
 public withdrawException(String message) {
     super(message);
 }
}

class BankAccount {
 private double balance = 1000;

 public void withdraw(double amount) throws withdrawException {
     if (amount > balance) {
         throw new withdrawException("Insufficient funds for withdrawal.");
     }
     balance -= amount;
     System.out.println("Withdrawal successful. Remaining balance: " + balance);
 }

 
}

public class customchecked {
	public static void main(String[] args) {
	     BankAccount account = new BankAccount();
	     try {
	         account.withdraw(2000);
	     } catch (withdrawException e) {
	         System.out.println("Error: " + e.getMessage());
	     }
	 }

}






