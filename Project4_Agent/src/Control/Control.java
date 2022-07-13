/**
 * The Control class is contained within the Control package. 
 * It contains static (helper) methods that control the data 
 * input to the program for its smooth execution.
 * @project Agent
 * @package Control
 * @author Moraitopoulos, Panagiotis
 * @version 2022.06.19
 * @class MIS2022
 */
package Control;
import java.util.*;

public class Control {
	
	/*Create an "in" object for entering data from the keyboard*/
	public static Scanner in = new Scanner(System.in);
	
	/*Checks that the String contains only letters and spaces.*/
	public static String checkName(String name) {
		while(!name.matches("[a-zA-Z]+( +[a-zA-Z]+)*") || name.isBlank()) {
			System.out.println("Lathos Onoma. Eisagete onoma kai meta epithero. Den epitrepontai kena.");
			name = in.nextLine();
		}
		 return name;
	}
	
	/*Check that the double is positive and no zero*/
	public static double checkDoubleAboveZero(double ammount) {
		while(ammount<=0) {
			System.out.println("Lathos Timi. I timi prepei na einai dekadiki megaliteri toy midenos");
			ammount = in.nextDouble();
			in.nextLine();
		}
		return ammount;
	}
	
	/*Check that the integer is positive and no zero*/
	public static int checkIntAboveZero (int ammount) {
		while(ammount<=0) {
			System.out.println("Lathos Timi. I timi prepei na einai akeraia megaliteri toy midenos");
			ammount = in.nextInt();
			in.nextLine();
		}
		return ammount;
	}
	/*Check that the integer is positive*/	
	public static int checkIntAboveOrEqualZero (int ammount) {
		while(ammount<0) {
			System.out.println("Orisate lathos timi. i timi prepei na einai dekadiki megaliteri i isi tou midenos");
			ammount = in.nextInt();
			in.nextLine();
		}
		return ammount;
	}
	/*Check that the integer is 1 or 0*/
	public static int checkDigitalInt(int ammount) {
		while(ammount!=1 || ammount!=0) {
			System.out.println("Lathos Timi. I timi prepei na einai akeraia megaliteri i isi toy midenos.");
			ammount = in.nextInt();
			in.nextLine();
		}
		return ammount;
	}
	/*Check for double to be between or equal to 0 and 1*/
	public static double checkDoubleBelowOne(double ammount) {
		while(ammount>1 || ammount <0) {
			System.out.println("Lathos Timi. I timi prepei na einai dekadiko megaliteri i isi toy midenos/ena");
			ammount = in.nextDouble();
			in.nextLine();
		}
		return ammount;
	}
}
