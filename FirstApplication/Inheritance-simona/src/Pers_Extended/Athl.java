
package Pers_Extended;

public class Athl extends Pers {

	private int noOfMedals;

	public Athl(String name, String address, int age, int noOfMedals) {
		super(name, address, age);
		this.noOfMedals = noOfMedals;
	}

	@Override
	public double bonus() {
		return noOfMedals * 10_000;
	}

	public int getNoOfMedals() {
		return noOfMedals;
	}

	public void setNoOfMedals(int noOfMedals) {
		this.noOfMedals = noOfMedals;
	}

	@Override
	public String toString() {
		return  "[ Athl "+ super.toString()+"]";
	}
}
