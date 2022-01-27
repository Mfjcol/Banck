package banck;

public class SavingsAccout  extends SuperAccout{
	public SavingsAccout(Client client) {
		super(client);
		
	}

	public void printStatus() {
		System.out.println("\n===== Current Account Statement ======"  );
		super.imprimir();
	
	}

	@Override
	public void witdraw(double value) {
		// TODO Auto-generated method stub
		
	}
	
}


