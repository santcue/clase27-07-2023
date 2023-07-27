package encapsulation;

import javax.swing.*;

public class MainHouse {
    public static void main(String[] args) {
        House house = new House();
        house.setAddress(JOptionPane.showInputDialog("enter the address: "));
        house.setPrice(Integer.parseInt(JOptionPane.showInputDialog("enter the price: ")));
        house.setNeighborhood(JOptionPane.showInputDialog("enter the neighborhood: "));
        JOptionPane.showMessageDialog(null,house.getAddress());
        JOptionPane.showMessageDialog(null,house.getPrice());
        JOptionPane.showMessageDialog(null,house.getNeighborhood());
    }
}
