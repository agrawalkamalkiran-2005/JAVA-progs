import java.awt.*;
import java.awt.event.*;
public class driver6 extends Frame {
    private TextField textField1;
    private Button countButton, resetButton;
    static int count = 0;
    public driver6() {
        setTitle("driver6");
        setSize(300, 250);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        setLayout(null);
        textField1 = new TextField();
        textField1.setEditable(false);
        countButton = new Button("Count");
        resetButton = new Button("Reset");
        textField1.setBounds(30, 50, 130, 30);
        countButton.setBounds(180, 50, 80, 30);
        resetButton.setBounds(50, 100, 80, 30);
        add(textField1); add(countButton); add(resetButton);
        textField1.setText(Integer.toString(count));
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(Integer.toString(++count));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = 0;
                textField1.setText(Integer.toString(count));
            }
        });
    }
    public static void main(String[] args) {
        driver6 f = new driver6();
        f.setVisible(true);
    }
}
