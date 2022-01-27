package banck;

public abstract class SuperAccout  implements IAccout {
	
	private static int STANDARD_AGENCY = 108;
	private static int SEQUENTIAL = 1;
	
	protected  int agency;	
	protected  int number;
	protected  double witdraw;
	protected Client client;

   
	
	public SuperAccout(Client client) {
		this.agency = STANDARD_AGENCY;
		this.number = SEQUENTIAL++ ;
		this.client = client;
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	

	public double getWitdraw() {
		return witdraw;
	}

	
	public void toWitddraw(double value) {
		this.witdraw -= value;
		
	}

	
	public void deposit(double value) {
		this.witdraw += value;
		
	}


	public void transfer(double value, SuperAccout destiny) {
		this.toWitddraw(value);
		destiny.deposit(value);
		
		
	}

	protected void imprimir() {
		System.out.println (String.format(String.format("           Holder:" +" Alexis")));
		System.out.println (String.format("           Agency %d ",this.agency));
		System.out.println (String.format("           Account Number %d ",this.number));
		System.out.println (String.format("           Balance %.2f ",this.witdraw));
	}

}



