import java.awt.*;
import java.awt.event.*;
public class driver3 extends Frame {
    private TextField textField1, textField2, resultField;
    private Button subtractButton, addButton;
    public driver3() {
        setTitle("driver3");
        setSize(300, 250);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        setLayout(null);
        textField1 = new TextField();
        textField2 = new TextField();
        resultField = new TextField();
        resultField.setEditable(false);
        subtractButton = new Button("-");
        addButton = new Button("+");
        textField1.setBounds(30, 50, 130, 30);
        textField2.setBounds(30, 100, 130, 30);
        resultField.setBounds(30, 150, 130, 30);
        addButton.setBounds(50, 200, 80, 40);
        subtractButton.setBounds(150, 200, 80, 40);
        add(textField1); add(textField2); add(resultField);
        add(addButton); add(subtractButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(textField1.getText());
                    int b = Integer.parseInt(textField2.getText());
                    resultField.setText(Integer.toString(a + b));
                } catch (Exception ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });
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
        driver3 frame = new driver3();
        frame.setVisible(true);
    }
}
