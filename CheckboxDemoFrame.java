import java.awt.*;
import java.awt.event.*;

public class CheckboxDemoFrame extends Frame implements ItemListener {
    String msg = "";
    Checkbox Win98, winNT, solaris, mac;

    public CheckboxDemoFrame() {
        // Set layout for the frame
        setLayout(new FlowLayout());

        // Create checkboxes
        Win98 = new Checkbox("Windows 98/XP", null, true);
        winNT = new Checkbox("Windows NT/2000");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");

        // Add checkboxes to the frame
        add(Win98);
        add(winNT);
        add(solaris);
        add(mac);

        // Register item listeners
        Win98.addItemListener(this);
        winNT.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        // Configure the frame
        setTitle("Checkbox Demo");
        setSize(250, 200);

        // Add a window listener for closing the frame
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

    // Override paint method to display current checkbox states
    public void paint(Graphics g) {
        super.paint(g); // Ensure the frame redraws correctly
        msg = "Current state: ";
        g.drawString(msg, 6, 80);
        msg = " Windows 98/XP: " + Win98.getState();
        g.drawString(msg, 6, 100);
        msg = " Windows NT/2000: " + winNT.getState();
        g.drawString(msg, 6, 120);
        msg = " Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);
        msg = " MacOS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        CheckboxDemoFrame frame = new CheckboxDemoFrame();
        frame.setVisible(true);
    }
}
