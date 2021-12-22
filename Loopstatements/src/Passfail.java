import javax.swing.JOptionPane;
public class Passfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
        String gradeAsString;   
        gradeAsString = JOptionPane.showInputDialog (null,"What is your grade?");
        grade = Integer.parseInt (gradeAsString);
        if ( grade >= 60 )
        {
            JOptionPane.showMessageDialog(null,"You passed!!!" );
            JOptionPane.showMessageDialog(null,"Congratulations!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You failed!");
        }
     }
	}


