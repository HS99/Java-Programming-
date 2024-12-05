import java.awt.*;
import java.awt.event.*;

public class ListDemoFrame extends Frame implements ActionListener {
    List os, browser;
    String msg = "";

    public ListDemoFrame() {
        // Set layout for the frame
        setLayout(new FlowLayout());

        // Initialize list components
        os = new List(4, true); // Multiple selections allowed
        browser = new List(4, false); // Single selection allowed

        // Add items to OS list
        os.add("Windows 98/XP");
        os.add("Windows NT/2000");
        os.add("Solaris");
        os.add("MacOS");

        // Add items to Browser list
        browser.add("Netscape 3.x");
        browser.add("Netscape 4.x");
        browser.add("Netscape 5.x");
        browser.add("Netscape 6.x");
        browser.add("Internet Explorer 4.0");
        browser.add("Internet Explorer 5.0");
        browser.add("Internet Explorer 6.0");
        browser.add("Lynx 2.4");
        browser.select(1); // Default selection

        // Add lists to the frame
        add(os);
        add(browser);

        // Register action listeners for both lists
        os.addActionListener(this);
        browser.addActionListener(this);

        // Configure the frame
        setTitle("List Demo");
        setSize(300, 180);

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose(); // Dispose of this program window
                //System.exit(0);
                dispose();
            }
        });
    }

    // Handle action events for list selections
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    // Override paint method to display current selections
    public void paint(Graphics g) {
        int[] idx;
        msg = "Current OS: ";
        idx = os.getSelectedIndexes(); // Get selected indexes for the OS list
        for (int i = 0; i < idx.length; i++) {
            msg += os.getItem(idx[i]) + " ";
        }
        g.drawString(msg, 6, 120);

        msg = "Current Browser: ";
        msg += browser.getSelectedItem(); // Get the selected item for the Browser list
        g.drawString(msg, 6, 140);
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        ListDemoFrame frame = new ListDemoFrame();
        frame.setVisible(true);
    }
}
