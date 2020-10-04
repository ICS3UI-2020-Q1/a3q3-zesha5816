
import java.util.Scanner;
/**
 * a program that will ask the user for a letter grade. It will then output what * *percentage range that would be
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
			//create a scanner for the user 
			Scanner input = new Scanner(System.in);
			//prompts user for their grade
			System.out.println("Please enter a letter grade");
			//gets input from user
			String grade = input.nextLine();
			//setups the switch command
			switch ( grade ) {
				//if its the grade A
				case "A":
					System.out.println("This is between 80% and 100%");
					break;
				case "B":
					System.out.println("This is between 70% and 79%");
					break;
				case "C":
					System.out.println("This is between 60% and 69%");
					break;
				case "D":
				 	System.out.println("This is between 50% and 59%");
					break;
				default:
					System.out.println("This is between 0% and 49%");
					break;
			}
		}
}
