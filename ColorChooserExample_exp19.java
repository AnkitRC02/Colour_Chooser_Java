import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserExample_exp19 extends JFrame {

    public ColorChooserExample_exp19() {
        setTitle("Color Chooser Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button to open the color chooser
        JButton chooseColorButton = new JButton("Choose Color");
        chooseColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a color chooser dialog
                Color initialColor = Color.BLACK; // Initial color
                Color selectedColor = JColorChooser.showDialog(ColorChooserExample_exp19.this, "Choose a color", initialColor);

                // Process the selected color
                if (selectedColor != null) {
                    // Perform actions with the selected color
                    System.out.println("Selected color: " + selectedColor);
                }
            }
        });

        // Add the button to the frame
        add(chooseColorButton);

        // Set frame size and visibility
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorChooserExample_exp19::new);
    }
}
