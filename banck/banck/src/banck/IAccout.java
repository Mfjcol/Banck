package banck;

public interface IAccout {
	
	
	void witdraw(double value);
	
	void deposit(double value);

	void transfer(double value, SuperAccout destiny);

	void toWitddraw(double value);
	
	void printStatus ();
}
