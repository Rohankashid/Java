import javax.swing.*;
import java.awt.event.*;
public class gui implements ActionListener {
 JButton button;
 public static void main (String[] args) {
 gui gui = new gui();
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
 button.setText("i've been clicked");
 }
}