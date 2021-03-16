import javax.swing.JOptionPane;
import java.lang.Math;
public class Calculate {
	public static void main(String[] args) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double sum = num1 + num2;
		double diffirence = Math.abs(num1 - num2);
		double product = num1 * num2;
		double quotient = 0;
		while ((quotient+1) * num2 < num1) {
				quotient +=1;
		}
		double divisor = num1 % num2;
		JOptionPane.showMessageDialog(null, sum,
				"Show Sum",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, diffirence,
				"Show Siffirence",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, product,
				"Show Product",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, quotient,
				"Show Quotient",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, divisor,
				"Show Divisor",JOptionPane.INFORMATION_MESSAGE);
		String workingDir = System.getProperty("user.dir");
		System.out.println("Thư mục Project đang làm việc : " + workingDir);
	}
	
}
