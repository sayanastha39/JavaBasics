package inclass;
import javax.swing.JOptionPane;

public class JOptionPaneTest {

	public static void main(String[] args) {
		
		//Joption return type is String so need to parse int to string
		int a  = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
		int b  = Integer.parseInt(JOptionPane.showInputDialog("Enter b: ")); 
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
	
		
		//If you want to show message in console
		JOptionPane.showMessageDialog(null, "Sum of a " + a + " and b " + b+ " is:" + sum );
		JOptionPane.showMessageDialog(null, "Subtraction of a " + a + " and b " + b+ " is:" + sub);
		JOptionPane.showMessageDialog(null, "Multiplication of a " + a + " and b " + b+ " is:" + mul);
		JOptionPane.showMessageDialog(null, "Division of a " + a + " and b " + b+ " is:" + div);
		
		//if you want to show in a dialog box
		//System.out.println("Sum of a " + a + " and b " + b+ " is:" + sum);

	}
	

}
