package banck;

public class main {

	public static void main(String[] args) {
		Client cl =  new Client();
		
		cl.getName();

		SuperAccout cc =  new Accout(cl);
		SuperAccout sa = new SavingsAccout(cl);
		
		cc.deposit(100);
		cc.transfer(30.5, sa);
		
		cc.printStatus();
		sa.printStatus();
		
		
		

	}

}
