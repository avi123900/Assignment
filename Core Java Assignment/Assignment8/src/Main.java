abstract class GeneralBank{
	void getSavingInterestRate() {
}
	void getFixedInterestRate() {
		
	}
}
	class ICICIBank extends GeneralBank{
		public void getSavingInterestRate() {
			System.out.println("Savings 4%");
		}
		public void getFixedInterestRate() {
			System.out.println("Fixed 8.5%");
		}
	}
		
	
	class KotMBank extends GeneralBank{
		
		public void getSavingInterestRate() {
			System.out.println("Savings 6%");
		}
		public void getFixedInterestRate() {
			System.out.println("Fixed 9%");
		}
	}
public class Main {
	public static void main(String args[]) {
		ICICIBank ob=new ICICIBank();
		ob.getSavingInterestRate();
		ob.getFixedInterestRate();
		KotMBank ob1=new KotMBank();
		ob1.getSavingInterestRate();
		ob1.getFixedInterestRate();
		GeneralBank ob2=new ICICIBank();
		ob2.getSavingInterestRate();
		ob2.getFixedInterestRate();
		GeneralBank ob3=new KotMBank();
		ob3.getSavingInterestRate();
		ob3.getFixedInterestRate();
		
		
		
		
		
	}

}
