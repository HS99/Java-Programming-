import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaDemoFrame extends Frame {

    public TextAreaDemoFrame() {
        // Set the frame properties
        setTitle("Text Area Demo");
        setSize(300, 250);

        // Create the text for the TextArea
        String val = "There are two ways of constructing " +
                      "a software design.\n" +
                      "One way is to make it so simple\n" + 
                      "that there are obviously no deficiencies.\n" +
                      "And the other way is to make it so complicated\n" +
                      "that there are no obvious deficiencies.\n\n" + 
                      " -C.A.R. Hoare\n\n" +
                      "There's an old story about the person who wished\n" +
                      "his computer were as easy to use as his telephone.\n" +
                      "That wish has come true,\n" +
                      "since I no longer know how to use my telephone.\n\n" +
                      " -Bjarne Stroustrup, AT&T, (inventor of C++)";

        // Create TextArea and set its content
        TextArea text = new TextArea(val, 10, 30);

        // Add the TextArea to the frame
        add(text);

        // Set the layout and make the frame visible
        setLayout(new FlowLayout());
        setVisible(true);

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
        new TextAreaDemoFrame();
    }
}
