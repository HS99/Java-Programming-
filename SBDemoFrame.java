import java.awt.*;
import java.awt.event.*;

public class SBDemoFrame extends Frame implements AdjustmentListener, MouseMotionListener {
    String msg = "";
    Scrollbar vertSB, horzSB;

    public SBDemoFrame() {
        // Get screen width and height for setting scrollbar ranges
        int width = 300;
        int height = 200;

        // Create vertical and horizontal scrollbars
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, width);

        // Add scrollbars to the frame
        add(vertSB);
        add(horzSB);

        // Register listeners for the scrollbars and mouse motion
        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
        addMouseMotionListener(this);

        // Set layout for the frame
        setLayout(new FlowLayout());

        // Frame settings
        setTitle("Scrollbar Demo");
        setSize(300, 200);

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                //System.exit(0);
                dispose();
            }
        });
    }

    // Handle adjustment events for the scrollbars
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        repaint();
    }

    // Handle mouse dragging to move the scrollbars
    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        vertSB.setValue(y);
        horzSB.setValue(x);
        repaint();
    }

    // Empty method for MouseMotionListener (required for interface implementation)
    public void mouseMoved(MouseEvent me) {
    }

    // Override paint method to display the scrollbar values and mouse position
    public void paint(Graphics g) {
        msg = "Vertical: " + vertSB.getValue();
        msg += ", Horizontal: " + horzSB.getValue();
        g.drawString(msg, 6, 160);

        // Show the current mouse drag position
        g.drawString("*", horzSB.getValue(), vertSB.getValue());
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        SBDemoFrame frame = new SBDemoFrame();
        frame.setVisible(true);
    }
}
