import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthCentreApp {
    
    private JFrame frame;
    private JTextField nameField, ageField, contactField;
    private JTextArea medicalHistoryArea;
    private JButton submitButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                HealthCentreApp window = new HealthCentreApp();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public HealthCentreApp() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);

        nameField = new JTextField();
        panel.add(nameField);
        nameField.setColumns(10);

        JLabel ageLabel = new JLabel("Age:");
        panel.add(ageLabel);

        ageField = new JTextField();
        panel.add(ageField);
        ageField.setColumns(10);

        JLabel contactLabel = new JLabel("Contact Number:");
        panel.add(contactLabel);

        contactField = new JTextField();
        panel.add(contactField);
        contactField.setColumns(10);

        JLabel medicalHistoryLabel = new JLabel("Medical History:");
        panel.add(medicalHistoryLabel);

        medicalHistoryArea = new JTextArea();
        panel.add(new JScrollPane(medicalHistoryArea));

        submitButton = new JButton("Submit");
        panel.add(submitButton);
        
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String contact = contactField.getText();
                String medicalHistory = medicalHistoryArea.getText();

                // Here you can implement the logic to save the patient's information
                JOptionPane.showMessageDialog(frame, "Patient Registered: " + name);
            }
        });
    }
}
