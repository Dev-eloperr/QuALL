import javax.swing.*;
import java.awt.*;

public class Main {
    static mainFrame obj = new mainFrame();
    public static void main(String[] args) {
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obj.setFocusable(true);
        obj.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }
}
class mainFrame extends JFrame {
    mainPanel mainpanel = new mainPanel();
    public void mainFrame() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); //to set UI
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
        add(mainpanel,new FlowLayout());
    }
}
class mainPanel extends JPanel{

    void mainPanel(){
        add(new JButton("Test-Remove this"));
    }
    @Override
    protected void paintComponent(Graphics g){

    }
}