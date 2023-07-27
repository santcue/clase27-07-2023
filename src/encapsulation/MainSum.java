package encapsulation;

import javax.swing.*;

public class MainSum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.setNumb1(Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: ")));
        sum.setNumb2(Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: ")));
        JOptionPane.showMessageDialog(null,"The addition is: "+sum.sum());
    }
}
}
