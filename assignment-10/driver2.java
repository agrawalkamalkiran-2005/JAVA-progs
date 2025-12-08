import java.awt.*;
import java.awt.event.*;
public class driver2 extends Frame {
    private TextField textField1, textField2, resultField;
    private Button subtractButton;
    public driver2() {
        setTitle("Assignment-2");
        setSize(300, 250);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        setLayout(null);
        textField1 = new TextField();
        textField2 = new TextField();
        resultField = new TextField();
        resultField.setEditable(false);
        subtractButton = new Button("Subtract");
        textField1.setBounds(30, 50, 130, 30);
        textField2.setBounds(30, 100, 130, 30);
        resultField.setBounds(30, 150, 130, 30);
        subtractButton.setBounds(30, 200, 130, 30);
        add(textField1); add(textField2); add(resultField); add(subtractButton);
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(textField1.getText());
                    int b = Integer.parseInt(textField2.getText());
                    resultField.setText(Integer.toString(a - b));
                } catch (Exception ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });
    }
    public static void main(String[] args) {
        driver2 frame = new driver2();
        frame.setVisible(true);
    }
}
