package myy.com.input_messagebox;
import javax.swing.JOptionPane;

public class UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "your name is "+ name);
		

	}

}
