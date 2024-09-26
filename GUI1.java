import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI1 {
    public static void main(String[] args) {
        JFrame jframe=new JFrame();
        JButton jbutton=new JButton("click me");
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.getContentPane().add( jbutton);
        jframe.setSize(300,300);
        jframe.setVisible(true);

    }
}
