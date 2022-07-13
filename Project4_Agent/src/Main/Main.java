/**
 * The Main class is where the program executes.
 * @project Agent
 * @package Main
 * @author Moraitopoulos, Panagiotis
 * @version 2022.06.19
 * @class MIS2022
 */
package Main;
import Earner.*;


public class Main {

	public static void main(String[] args) {
		
		//Construct the DB of the program
		EarnerDB AgentsDB = new EarnerDB();
		
		//Construct two roles of Employees
		WageEarner wage1 = new WageEarner("Nikolaos Nikolaoy", 1000, 0);
		RateEarner rate1 = new RateEarner("Dhmitrioy Dimitrios", 0.05);
		
		//Transactions of the first employee
		wage1.sale();
		wage1.collectDebt(3000);
		wage1.sale();
		wage1.sale();
		wage1.seminarsPart();
		wage1.collectDebt(4000);
		
		//Transactions of the second employee
		rate1.collectDebt(2000);
		rate1.sale();
		rate1.sale();
		rate1.collectDebt(1000);
		rate1.collectDebt(4000);
		rate1.sale();
		rate1.sale();
		rate1.collectDebt(4000);
		
		//Add two employees to the DB
		AgentsDB.storeEarners(wage1);
		AgentsDB.storeEarners(rate1);
		
		//Print monthly Employees' Income
		AgentsDB.printPayroll();
	}
}