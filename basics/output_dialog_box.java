import javax.swing.JOptionPane;

public class OutputDialogBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arguments description
		// First
		//     Component: Visual Component can be left in Null  
		//     message: string
		//     title:   string this goes in the dialog box title
		//     message_type: int 
		//         -1: PLAIN_MESSAGE     
		//          0: ERROR_MESSAGE
		//          1: INFORMATION_MESSAGE
		//          2: WARNING_MESSAGE
		//          3: QUESTION_MESSAGE
		// the fourth parameter could be let as 0 as well
		double PI = 3.1416;
		double radius = 9.5;
		String message = "Radius = " + radius + "\n" + "Area = "+ (PI * radius * radius);
		JOptionPane.showMessageDialog(null, message, "Error aritmético", JOptionPane.ERROR_MESSAGE);
	}

}
