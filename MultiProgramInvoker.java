import java.awt.*;
import java.awt.event.*;

public class MultiProgramInvoker extends Frame implements ActionListener {
    Choice programChoice;
    Button invokeButton;

    public MultiProgramInvoker() {
        // Set up the frame
        setTitle("Multi-Program Invoker");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Create a choice dropdown
        programChoice = new Choice();
        programChoice.add("Select a Program");
        programChoice.add("LabelDemoFrame");
        programChoice.add("CheckboxDemoFrame");
        programChoice.add("CBGroupFrame");
        programChoice.add("ChoiceDemoFrame");
        programChoice.add("ListDemoFrame");
        programChoice.add("SBDemoFrame");
        programChoice.add("TextFieldDemoFrame");
        programChoice.add("TextAreaDemoFrame");
        add(programChoice);

        // Create an invoke button
        invokeButton = new Button("Invoke");
        invokeButton.addActionListener(this);
        add(invokeButton);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedProgram = programChoice.getSelectedItem();
        switch (selectedProgram) {
            case "LabelDemoFrame":
            new LabelDemoFrame().setVisible(true);
                break;
            case "CheckboxDemoFrame":
            new CheckboxDemoFrame().setVisible(true);
                break;
            case "CBGroupFrame":
            new CBGroupFrame().setVisible(true);
                 break;
            case "ChoiceDemoFrame":
            new ChoiceDemoFrame().setVisible(true);
                break;
            case "ListDemoFrame":
            new ListDemoFrame().setVisible(true);
                break;
            case "SBDemoFrame":
            new SBDemoFrame().setVisible(true);
                break;
            case "TextFieldDemoFrame":
            new TextFieldDemoFrame().setVisible(true);
                break;
            case "TextAreaDemoFrame":
            new TextAreaDemoFrame().setVisible(true);
                break;
            default:
                System.out.println("Please select a valid program.");
        }
    }

   


    public static void main(String[] args) {
        MultiProgramInvoker frame = new MultiProgramInvoker();
        frame.setVisible(true);
    }
}


