import java.awt.*;
import java.awt.event.*;

public class TextFieldDemoFrame extends Frame implements ActionListener {
    TextField name, pass;

    public TextFieldDemoFrame() {
        // Set the frame properties
        setTitle("Text Field Demo");
        setSize(380, 150);

        // Create labels and text fields
        Label namep = new Label("Name: ", Label.RIGHT);
        Label passp = new Label("Password: ", Label.RIGHT);
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('*');

        // Add components to the frame
        add(namep);
        add(name);
        add(passp);
        add(pass);

        // Register action listeners for both text fields
        name.addActionListener(this);
        pass.addActionListener(this);

        // Set the layout for the frame
        setLayout(new FlowLayout());

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                //System.exit(0);
                dispose();
            }
        });
    }

    // Handle action events (when Enter key is pressed)
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    // Override paint method to display entered text
    public void paint(Graphics g) {
        g.drawString("Name: " + name.getText(), 6, 60);
        g.drawString("Selected text in name: " + name.getSelectedText(), 6, 80);
        g.drawString("Password: " + pass.getText(), 6, 100);
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        TextFieldDemoFrame frame = new TextFieldDemoFrame();
        frame.setVisible(true);
    }
}
