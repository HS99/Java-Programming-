import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelDemoFrame extends Frame {
    public LabelDemoFrame() {
        // Set layout for the frame
        setLayout(new FlowLayout());

        // Create labels
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");

        // Add labels to the frame
        add(one);
        add(two);
        add(three);

        // Set the frame properties
        setTitle("Label Demo");
        setSize(300, 200);

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                //System.exit(0);
                dispose();
            }
        });
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        LabelDemoFrame frame = new LabelDemoFrame();
        frame.setVisible(true); // Ensure the frame is visible
    }
}
