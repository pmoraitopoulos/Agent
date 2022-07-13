/**
 * The EarnerDB class is contained within the Earner package. 
 * It represents the data storage space and includes relevant methods 
 * @project Agent
 * @package Earner
 * @author Moraitopoulos, Panagiotis
 * @version 2022.06.19
 * @class MIS2022
 */
package Earner;
import java.util.ArrayList;
import Control.*;

public class EarnerDB {
	
	private ArrayList<Earner> agents;
	
	/*Constructor*/
	public EarnerDB() {
		agents = new ArrayList<>();
	}
	
	/*Method to store Objects in the ArrayList*/
	public void storeEarners(Earner agent) {
		agents.add(agent);
	}
	
	
	/*Method that parses the ArrayList and calculate the Income 
	 * of every Employee, print the data, initialize 
	 * the fields and calculate the sum of income*/
	public void printPayroll() {
		double totalMonthlyIncome = 0;
		int i = 1;
		System.out.println("***** Enarxi Ektiposis Misthodosia Tmimatos Trexontos Mina ******\n");
		for(Earner agent : agents) {
			System.out.println("----Misthodosia " + i+"ou Ipaliloy - Enarxi ----");
			agent.MonthlyCalculation();
			System.out.println("----Misthodosia " + i+"ou Ipaliloy - Telos ----\n");
			totalMonthlyIncome += agent.monthlyIncome;
			i ++;
		}
		System.out.println("\n----------------------------------\n"+"Sinoliki Misthodosia: "+totalMonthlyIncome + " Euro" + "\n----------------------------------");
		System.out.println("\n***** Telos Ektiposis Misthodosia Tmimatos Trexontos Mina ******\n");
	}
	
	
	/*Method that parses the ArrayList and calculate the Income 
	 * of every Employee, print the data, initialize 
	 * the fields and calculate the sum of income for a specific role of employee*/
	public void printRolePayroll(int i) {
		double EarnerMonthlyIncome = 0;
		i = Control.checkDigitalInt(i);
		int j = 1;
		System.out.print("***** Enarxi Ektiposis Misthodosia Tmimatos Trexontos Mina ");
		switch(i) {
		case 0:
			System.out.println("Misthoton ******\n");
			for(Earner agent : agents) {
				if(agent instanceof WageEarner) {
					System.out.println("----Misthodosia " + j+"ou Ipaliloy - Enarxi ----");
					agent.MonthlyCalculation();
					System.out.println("----Misthodosia " + j+"ou Ipaliloy - Telos ----\n");
					EarnerMonthlyIncome += agent.monthlyIncome;
					j ++;
				}
			}
			System.out.println("\n--------------------\n"+"Sinolo: "+EarnerMonthlyIncome+ " Euro" + "\n--------------------");
			System.out.print("***** Telos Ektiposis Misthodosia Tmimatos Trexontos Mina Misthoton *****\n");
			break;
		case 1:
			System.out.println("Ergazomenon me pososto ******\n");
			for(Earner agent : agents) {
				if(agent instanceof RateEarner) {
					System.out.println("----Misthodosia " + j+"ou Ipaliloy - Enarxi ----");
					agent.MonthlyCalculation();
					System.out.println("----Misthodosia " + j+"ou Ipaliloy - Telos ----\n");
					EarnerMonthlyIncome += agent.monthlyIncome;
					j ++;
				}
			}
			System.out.println("\n--------------------\n"+"Sinolo: "+EarnerMonthlyIncome+ " Euro" + "\n--------------------");
			System.out.print("***** Telos Ektiposis Misthodosia Tmimatos Trexontos Mina Ergazomenon me pososto *****\n");
			break;
		}
	}
	
	/*Search for an employee. Returns his info.*/
	public void findEarner(String name) {
		boolean found = false;
		System.out.println("Anazitisi gia Ergazomeno: " + name);
		for(Earner agent : agents) {
			if (agent.name.equals(name)) {
				System.out.println("Vrethike Eggrafi");
				System.out.println(agent.getInfo());
				found = true;
				break;
			}
		}
		if(!found)
			System.out.println("Kanena Apotelesma");
	}
	
	
	
}