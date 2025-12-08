

//Custom unchecked exception
class transactException extends RuntimeException {
 public transactException(String message) {
     super(message);
 }
}

class TransactionProcessor {
 public void processTransaction(double amount) {
     if (amount <= 0) {
         throw new transactException("Transaction amount must be positive.");
     }
     System.out.println("Transaction of ₹" + amount + " processed.");
 }


}

public class Customunchecked {
	 public static void main(String[] args) {
	     TransactionProcessor processor = new TransactionProcessor();
	     processor.processTransaction(-200); // Will throw unchecked exception
	 }
}




