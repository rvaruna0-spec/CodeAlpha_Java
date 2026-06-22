import javax.swing.*;
import java.awt.event.*;

public class StudentGradeTrackerGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Grade Tracker");

        JLabel label = new JLabel("Enter Grades (comma separated)");

        JTextField gradeField = new JTextField();

        JButton button = new JButton("Calculate");

        JTextArea resultArea = new JTextArea();

        label.setBounds(50, 20, 250, 30);
        gradeField.setBounds(50, 60, 250, 30);
        button.setBounds(100, 110, 120, 30);
        resultArea.setBounds(50, 160, 250, 120);

        frame.add(label);
        frame.add(gradeField);
        frame.add(button);
        frame.add(resultArea);

        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String input = gradeField.getText();

                String[] grades = input.split(",");

                int highest = Integer.parseInt(grades[0].trim());
                int lowest = Integer.parseInt(grades[0].trim());

                int sum = 0;

                for(String gradeStr : grades) {

                    int grade =
                            Integer.parseInt(gradeStr.trim());

                    sum += grade;

                    if(grade > highest)
                        highest = grade;

                    if(grade < lowest)
                        lowest = grade;
                }

                double average =
                        (double) sum / grades.length;

                resultArea.setText(
                        "Average : " + average +
                        "\nHighest : " + highest +
                        "\nLowest : " + lowest
                );
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}