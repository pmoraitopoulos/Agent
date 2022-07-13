/**
 * The Earner super class is contained within the Earner package. 
 * It represents a worker containing generic attributes. 
 * Objects cannot be constructed from this class, 
 * since it does not represent an object completely.
 * @project Agent
 * @package Earner
 * @author Moraitopoulos, Panagiotis
 * @version 2022.06.19
 * @class MIS2022
 */
package Earner;
import Control.*;

public abstract class Earner{
	
	protected String name;
	protected int salesInMonth;
	protected double debtCollect;
	protected double monthlyIncome;
	protected int transactions; //how much debt collections have been made
	
	/*Super Constructor*/
	protected Earner(String name) {
		this.name = Control.checkName(name);
		this.salesInMonth = 0;
		this.debtCollect = 0;
		this.transactions = 0;
		this.monthlyIncome = 0;
	}	
	
	/*Increase the sales made in a Month by one*/
	public void sale() {
		this.salesInMonth++;
	}
	
	/*Increase the debt collection made by an employee*/
	public void collectDebt(double debt) {
		this.transactions++;
		this.debtCollect += Control.checkDoubleAboveZero(debt);		
	}
	
	/*Abstract methods. They are different between two roles*/
	protected abstract void calculateMonthlyIncome();
	
	protected abstract void initialize();
	
	
	/*Method that aggregates other methods of roles, calculates, prints and initializes data*/
	protected void MonthlyCalculation() {
		calculateMonthlyIncome();
		System.out.println(getInfo());
		initialize();
	}
	
	/*Change name of the Employee*/
	protected void setName(String name) {
		this.name = Control.checkName(name);
	}	
	
	/*Super method that returns the Employee's data*/
	protected String getInfo() {
		return "\nOnomateponimo: " + name + "\nPolisi Mixanimaton: " + salesInMonth + "\nEispraxi Ofeilon: " + debtCollect;
	}
	
}
