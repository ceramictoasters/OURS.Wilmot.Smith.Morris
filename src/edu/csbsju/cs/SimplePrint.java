package edu.csbsju.cs;

/**
 * Ceramictoasters eclipse exercise
 * @author Wilmot, Connor Smith, and Richard Morris
 * @version Merch 12th, 2018
 */
public class SimplePrint {
	private String pName;
	private int pAge;
	
	/**
         * Main constuctor
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}
	
	/**
	 * Default constructor
	 * Sets variables to null or 0
	 */
	public SimplePrint() {
		this.pName = null;
		this.pAge = 0;
	}

	/**
         * Main method this class
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Wilmot\nConnor Smith\nRichard Morris");

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[ " + i + " ] = " + args[i]);
		}
	}

	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
}
