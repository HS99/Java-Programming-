import java.awt.*;
import java.awt.event.*;

public class ChoiceDemoFrame extends Frame implements ItemListener {
    Choice os, browser;
    String msg = "";

    public ChoiceDemoFrame() {
        // Set layout for the frame
        setLayout(new FlowLayout());

        // Create choice lists
        os = new Choice();
        browser = new Choice();

        // Add items to OS choice list
        os.add("Windows 98/XP");
        os.add("Windows NT/2000");
        os.add("Solaris");
        os.add("MacOS");

        // Add items to Browser choice list
        browser.add("Netscape 3.x");
        browser.add("Netscape 4.x");
        browser.add("Netscape 5.x");
        browser.add("Netscape 6.x");
        browser.add("Internet Explorer 4.0");
        browser.add("Internet Explorer 5.0");
        browser.add("Internet Explorer 6.0");
        browser.add("Lynx 2.4");

        // Set default selection
        browser.select("Netscape 4.x");

        // Add choice lists to frame
        add(os);
        add(browser);

        // Register item listeners
        os.addItemListener(this);
        browser.addItemListener(this);

        // Configure the frame
        setTitle("Choice Demo");
        setSize(300, 180);

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

    // Override paint method to display current selections
    public void paint(Graphics g) {
        super.paint(g); // Ensure proper redrawing of the frame
        msg = "Current OS: ";
        msg += os.getSelectedItem();
        g.drawString(msg, 20, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 20, 140);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        ChoiceDemoFrame frame = new ChoiceDemoFrame();
        frame.setVisible(true);
    }
}
