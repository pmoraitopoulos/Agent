/**
 * The WageEarner sub class is contained within the Earner package. 
 * Includes fields and methods of sub class to describe a worker working with a salary
 * @project Agent
 * @package Earner
 * @author Moraitopoulos, Panagiotis
 * @version 2022.06.19
 * @class MIS2022
 */
package Earner;
import Control.*;

public class WageEarner extends Earner{
	
	private int seminars;
	protected double salary;
	
	
	/*Constructor*/
	public WageEarner(String name, double salary, int seminars) {
		super(name);
		this.seminars = Control.checkIntAboveOrEqualZero(seminars);
		this.salary = Control.checkDoubleAboveZero(salary);
	}
	
	/*Specific calculation of his Income*/
	protected void calculateMonthlyIncome() {
		
		double bonus = 1;
		
		if(salesInMonth>3) {
			bonus += 0.1;
		}
		if(debtCollect>5000) {
			bonus += 0.1;
		}
		bonus += seminars*0.05;
		
		monthlyIncome = bonus*salary;
	}
	
	/*Initialize fields*/
	protected void initialize() {
		debtCollect = transactions = salesInMonth = seminars= 0;
	}
	/*Returns rate earner info*/
	protected String getInfo() {
		return super.getInfo() +"\nVasikos Misthos: "+salary + "\nSeminaria: "+seminars + "\nMINIAIOS MISTHOS: "+monthlyIncome + " Euro\n";
	}
	
	/*Increase number of seminars the employee take part in a month by one*/
	public void seminarsPart() {
		seminars++;
	}
	

}
