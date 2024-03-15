//Action Event
import java.awt.*;
import java.awt.event.*;
public class ActionListenerExample implements ActionListener {
    TextField tf;
    public static void main(String[] args) {
        ActionListenerExample example = new ActionListenerExample();
        Frame f = new Frame("ActionListener Example");
        example.tf = new TextField();
        example.tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(example);
        f.add(b);
        f.add(example.tf); 
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        // Set text of the TextField
        tf.setText("Welcome to LUC.");
    }
}