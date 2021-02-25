import javax.swing.JOptionPane;
public class ShowTwoNumbers{
    public static void main(String[] args){
        String StrNum1,StrNum2;
        String strNotification = "You have just enter:";

        StrNum1 = JOptionPane.showInputDialog(null, "Please input the first number:","Input the first number ", JOptionPane.INFORMATION_MESSAGE);
        strNotification += StrNum1 + " and ";
        StrNum2 =JOptionPane.showInputDialog(null, "Please input the second number:","Input the second number ", JOptionPane.INFORMATION_MESSAGE);
        strNotification += StrNum2;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
