//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;
import java.awt.*;
class TimeTrackerInterface {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Time Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        //Creating the MenuBar and adding components
        JMenuBar menuBar = new JMenuBar();
        JMenu menuTimeTracker = new JMenu("Time Tracker");
        JMenu menuNewTracking = new JMenu("New Tracking");
        JMenu menuCalendar = new JMenu("Calendar");
        JMenu menuTimeSheet = new JMenu("Time Sheet");


        menuBar.add(menuTimeTracker);
        menuBar.add(menuNewTracking);
        menuBar.add(menuCalendar);
        menuBar.add(menuTimeSheet);
        // Menu 
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        menuTimeTracker.add(m11);
        menuTimeTracker.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
