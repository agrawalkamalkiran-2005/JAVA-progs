import java.awt.*;
import java.awt.event.*;
public class driver5 extends Frame {
    private TextField textField1, resultField;
    private Button reverseButton;
    public driver5() {
        setTitle("Calculate Reverse");
        setSize(300, 250);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        setLayout(null);
        textField1 = new TextField();
        resultField = new TextField();
        resultField.setEditable(false);
        reverseButton = new Button("Reverse");
        textField1.setBounds(30, 50, 130, 30);
        resultField.setBounds(30, 150, 130, 30);
        reverseButton.setBounds(30, 200, 130, 30);
        add(textField1); add(resultField); add(reverseButton);
        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    long n = Long.parseLong(textField1.getText());
                    long rev = 0;
                    while (n != 0) {
                        rev = rev * 10 + n % 10;
                        n /= 10;
                    }
                    resultField.setText(Long.toString(rev));
                } catch (Exception ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });
    }
    public static void main(String[] args) {
        driver5 frame = new driver5();
        frame.setVisible(true);
    }
}
