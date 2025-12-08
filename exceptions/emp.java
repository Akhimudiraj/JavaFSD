//unchecked exception
import java.util.Scanner;
class A{
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Age  :");	int age = sc.nextInt();
		if(age > 60) {
			// MaxAgeException -------- Age can be more the 60
			throw new MaxAgeException("Age can not be more the 60 ");
		}
		else if(age <=18) {
			throw new MinAgeException("Age can not be less then 18");
		}
		else {
			System.out.println("My Age is  :" + age );
		}
	}
}
class MaxAgeException extends RuntimeException{
	MaxAgeException(String msg){
		super(msg);
	}
}
class MinAgeException extends RuntimeException{
	public MinAgeException(String msg) {
		super(msg);
	}
}
public class emp {
	public static void main(String[] args) {
		try {
			A a = new A();
			a.display();
		}
		catch (MaxAgeException me) {
			System.out.println(me.getMessage());
		}
		catch (MinAgeException me) {
			System.out.println(me.getMessage());
		}
		catch (Exception e) {
		}
	}
}







