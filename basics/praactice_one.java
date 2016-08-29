import javax.swing.JOptionPane;

public class PracticeOne {

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
		String name = JOptionPane.showInputDialog(null,"Provide your name:", "input required",-1);
		
		JOptionPane.showMessageDialog(null, "the name provided in upper case is " +name.toUpperCase()+"\nthe name provided in lower case is "+name.toLowerCase(), "INPUT RESULT", 1);
		
		String year = JOptionPane.showInputDialog(null,"Provide your year of birth: ", "input required",-1);
		int yearint = Integer.parseInt(year);
				
		JOptionPane.showMessageDialog(null, "you could have "+(2016-yearint)+" or "+(2016-yearint-1)+" years", "INPUT RESULT", 1);
	}

}
