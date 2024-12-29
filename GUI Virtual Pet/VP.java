// Import the packages/libraries required for this program
// these will be for our gui
import javax.swing.*;
import java.awt.*;

// create our main class which has same name as file name
// here is twist, we are extending our class with jframe because of gui
public class VP extends JFrame{
    // create member variables which are called properties for our class
    // these properties will be used to store the values of our pets status
    private int hunger = 50;
    private int happiness = 50;
    private int energy = 50;

    // now we will create labels which will be used to display the status of our pet
    // these labels are for our gui
    private JLabel statusLabel;
    private JLabel petLabel;

    // create constructor for class
    public VP(){
        // set title of window
        super("Virtual Pet - Rodney");

        // set the layout of our window, size and closing operation
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CREATE our main panel and add a dorder layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        //now lets create a panel for pet image
        petLabel = new JLabel("<html>^._.^<br> (=>^<=)</html>", SwingConstants.CENTER);
        petLabel.setFont(new Font("Monospaced", Font.PLAIN, 24));

        //create status label
        statusLabel = new JLabel("", SwingConstants.CENTER);
        //lets initialize the status label with the current status 
        updateStatus();

        // create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        //create a feeding button
        JButton feedButton = new JButton("Feed");
        //add action listener when button is clicked
        feedButton.addActionListener(e -> {
            // when button is clicked, decrease hunger
            hunger = Math.max(0, hunger - 20);
            // increase energy
            energy = Math.min(100, energy + 10);
            // update status
            updateStatus();
            petLabel.setText("<html>^._.^<br> (=>^<=)</html>");
            // now lets reset face of pet after 1 second
            new Timer(1000, evt ->{
                petLabel.setText("<html>^._.^<br> (=>^<=)</html>");
                ((Timer)evt.getSource()).stop();
            }).start();
        });

        // create play button
        JButton playButton = new JButton ("Play");

        //add action listener when button is clicked
        playButton.addActionListener(e -> {
            // when button is clicked, increase happiness
            happiness = Math.max(0, happiness + 20);
            // decrease energy
            energy = Math.min(100, energy - 20);
            // increase hunger by 10
            hunger = Math.min(100, hunger + 10);
            // update status
            updateStatus();
            petLabel.setText("<html>^O_O^<br> (=>^<=)</html>");
            // now lets reset face of pet after 1 second
            new Timer(1000, evt ->{
                petLabel.setText("<html>^._.^<br> (=>^<=)</html>");
                ((Timer)evt.getSource()).stop();
            }).start();
        });

        // create sleep button
        JButton sleepButton = new JButton ("Sleep");

        //add action listener when button is clicked
        sleepButton.addActionListener(e -> {
            // increase energy
            energy = Math.min(100, energy + 20);
            // increase hunger by 10
            hunger = Math.min(100, hunger + 50);
            // update status
            updateStatus();
            petLabel.setText("<html>^U_U^<br> (=>^<=)</html>");
            // now lets reset face of pet after 1 second
            new Timer(1000, evt ->{
                petLabel.setText("<html>^._.^<br> (=>^<=)</html>");
                ((Timer)evt.getSource()).stop();
            }).start();
        });

        // add buttons to panel
        buttonPanel.add(feedButton);
        buttonPanel.add(playButton);
        buttonPanel.add(sleepButton);

        // add components
        mainPanel.add(petLabel, BorderLayout.CENTER);
        mainPanel.add(statusLabel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // add main panel
        add(mainPanel);

        // center window
        setLocationRelativeTo(null);
    }

    // create a method 
    private void updateStatus(){
        statusLabel.setText(String.format("Hunger: %d%% | Happiness: %d%% | Energy: %d%%", hunger, happiness, energy));
    }

    public static void main(String[] args){
        // create and show gui
        SwingUtilities.invokeLater(() ->{
            VP pet = new VP();
            pet.setVisible(true);
        });
    }
}

