package banck;

public class Accout  extends SuperAccout {
	
	public Accout(Client client) {
		super(client);
		
	}






	public void printStatus() {
		System.out.println("===== Current Account Statement ======"  );
		super.imprimir();
	
	}

	

	


	@Override
	public void witdraw(double value) {
		// TODO Auto-generated method stub
		
	}
}
