package arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StudentFirstNames {
	String msg = "";

	private ArrayList<String> a2Students = new ArrayList<String>();

	public StudentFirstNames() {

		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");

	}

	public void PrintSize() {
		System.out.println("Number of student names is " + a2Students.size());
	}

	public void PrintNames() {
		// System.out.println("Contains: " + a2Students);
		
		msg = "";
		for (int i = 0; i < a2Students.size(); i++) {
			msg = msg + " " + a2Students.get(i) + ",";
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void findName() {
		String n = JOptionPane.showInputDialog("What name would you like to search for?");
			if(a2Students.indexOf(n) < 0) {
				JOptionPane.showMessageDialog(null, "Sorry, name not found");
			} else {
				JOptionPane.showMessageDialog(null, "Name found!");
			}
	}
	public void addName() {
		String n = JOptionPane.showInputDialog("What name would you like to add?");
		
		if (a2Students.indexOf(n) < 0) {
			a2Students.add(n);
		} else {
			JOptionPane.showMessageDialog(null, "Name already exsists");
		}
	}
	
	public void deleteName() {
		String name = JOptionPane.showInputDialog("Enter a name to remove from the list");
		
		if (a2Students.indexOf(name) < 0) {
			JOptionPane.showMessageDialog(null, "That name is not on the list!");
		} else {
			a2Students.remove(name);
		}
	}
	
	public void replaceName() {
		String name = JOptionPane.showInputDialog("What name would you like to replace?");
		int index = a2Students.indexOf(name);
		if(index==-1) {
			JOptionPane.showMessageDialog(null, "You didn't put in a name from the list");
			return;
		}
		name = JOptionPane.showInputDialog("What would you like to replace the name with?");
		a2Students.set(index, name);
	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}

	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}

}
