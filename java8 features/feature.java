package fv;
interface Bank{
	void ROI();
	public abstract void card();
	//in java8 they have added this 2 extra features in interface ? default and static
	public default void OT() {
		System.out.println("Yes We provide a Online Transfer Services (Default balong to Objects");
	}
	public static void RD() {
		System.out.println("Yes we provide a RD services(Static Not belongs to Object)");
	}
	
}
class Sbi implements Bank{
	@Override
	public void ROI() {
		System.out.println("8 %");
	}
	@Override 
	public void card() {
		System.out.println("Both Debit and Credit ");
	}
}
class Axis implements Bank{
	@Override
	public void ROI() {
		System.out.println("10%");
	}
	@Override 
	public void card() {
		System.out.println("Only Debit Card...!");
	}
}
public class fe {

	public static void main(String[] args) {
		Bank sbi=new Sbi(); 
		sbi.card();
		sbi.ROI();sbi.OT();
		Bank.RD();//since its a static no need to call through the object
		System.out.println("===============");
		Bank axis=new Axis(); axis.ROI();axis.card();axis.OT();
		Bank.RD();

	}

}








class feature {
    public static void main(String[] args) {
        
    }
}