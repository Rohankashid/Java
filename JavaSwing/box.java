import javax.swing.*;
import java.awt.event.*;
public class box implements ActionListener {
 JButton button;
 public static void main (String[] args) {
 box gui = new box();
 gui.go();
 }
 public void go() {
 JFrame frame = new JFrame();
 button = new JButton("click me");
 button.addActionListener(this);
 frame.getContentPane().add(button);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(500,300);
 frame.setVisible(true);
 }
 public void actionPerformed(ActionEvent event) {
 button.setText("bsdk");
 }
}