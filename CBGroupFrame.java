import java.awt.*;
import java.awt.event.*;

public class CBGroupFrame extends Frame implements ItemListener {
    String msg = "";
    Checkbox Win98, winNT, solaris, mac;
    CheckboxGroup cbg;

    public CBGroupFrame() {
        // Set layout
        setLayout(new FlowLayout());

        // Create a CheckboxGroup
        cbg = new CheckboxGroup();

        // Create checkboxes and associate them with the group
        Win98 = new Checkbox("Windows 98/XP", cbg, true);
        winNT = new Checkbox("Windows NT/2000", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("MacOS", cbg, false);

        // Add checkboxes to the frame
        add(Win98);
        add(winNT);
        add(solaris);
        add(mac);

        // Register item listeners for the checkboxes
        Win98.addItemListener(this);
        winNT.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        // Configure the frame
        setTitle("CheckboxGroup Demo");
        setSize(250, 200);

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                //System.exit(0);
                dispose();
            }
        });
    }

    // Handle item state changes
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    // Override paint method to display the current selection
    public void paint(Graphics g) {
        super.paint(g); // Ensure the frame redraws correctly
        msg = "Current selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 50, 150);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        CBGroupFrame frame = new CBGroupFrame();
        frame.setVisible(true);
    }
}
