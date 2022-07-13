/**
 * The RateEarner sub class is contained within the Earner package. 
 * Includes fields and methods of sub class to describe a worker working at rates
 * @project Agent
 * @package Earner
 * @author Moraitopoulos, Panagiotis
 * @version 2022.06.19
 * @class MIS2022
 */
package Earner;
import Control.*;

public class RateEarner extends Earner{
	
	private double salesPercent;
	
	/*Constructor of the Sub Class*/
	public RateEarner(String name, double salesPercent) {
		super(name);
		this.salesPercent = Control.checkDoubleBelowOne(salesPercent);
	}
	
	
	/*Specific calculation of his Income*/
	protected void calculateMonthlyIncome() {
		
		double bonus = 0;
		
		if(debtCollect>5000) {
			bonus = 0.02;
		}
		monthlyIncome = salesPercent*salesInMonth*10000 + bonus*debtCollect;
	}
	
	/*Initialize fields*/
	protected void initialize() {
		debtCollect = salesInMonth = transactions = 0;
	}
	
	/*Returns rate earner info*/
	protected String getInfo() {
		return super.getInfo() + "\nPososto: " + salesPercent + "\nMINIAIOS MISTHOS: " + monthlyIncome + " Euro\n";
	}
	

}
