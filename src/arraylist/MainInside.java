package arraylist;

import javax.swing.JOptionPane;

public class MainInside {

	public static void main(String[] args) {
		
		gradingReqirements();
		
		StudentFirstNames a2 = new StudentFirstNames();
		/*
		a2.PrintSize();
		a2.PrintNames();
		a2.findName();
		a2.addName();
		a2.PrintNames();
		a2.deleteName();
		a2.PrintNames();
		a2.replaceName();
		a2.PrintNames();
		*/
		Boolean StopLoop = false;
		
		while(StopLoop == false) {
		Object[] selectionsArray = {"Show Names", "Add Name", "Remove name", "Replace name", "Exit"};
		String showFirst = "Show Names";
		String selection = (String) JOptionPane.showInputDialog(
							null,
							"Select an Option:",
							"Student Name List",
							JOptionPane.PLAIN_MESSAGE,
							null,
							selectionsArray,
							showFirst);
		if (selection == null) selection = "Cancelled";
		JOptionPane.showMessageDialog(null, "You have selected: " + selection);
		
		switch (selection) { // switch on string allowed in Java 7 and higher
		case "Show Names":
			JOptionPane.showMessageDialog(null,"Here are the names on the list so far.");
			a2.PrintNames();
			break;
			//break means all done, leave the switch block - almost always use break
			//if no break, execution continues for all remaining cases
		case "Add Name":
			a2.addName();
			break;
		case "Remove name":
			a2.deleteName();
			break;
		case "Replace name":
			a2.replaceName();
			
			break;
		case "Exit":
				System.exit(0);

			
			break;
		default:
			JOptionPane.showMessageDialog(null, "We are now in the Unknown Case or Cancelled switch block - what do you want to do?");
			break;
		}
		}
	}
	

	private static void gradingReqirements() {
		System.out.println(
		"Grading Req's:\n" +
		"1. All JOP and jar'd\n" +
		"2. First is a menu asking for desired option -- looped\n" +
		"3. Menu: Show Names, Add Name, Remove Name, Replace Name, exit\n\n"
		);
		
	}

}

/*
 * 
 * 1. add this functionality -- Ask for a name, add that name to ArrayList
 * 1a. test -- after each name, show size and contents
 * 
 * 
 * 
 */