import javax.swing.*;

public class DoToList {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple ToDo App");
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField taskField = new JTextField();
        taskField.setBounds(20, 20, 200, 30);
        frame.add(taskField);

        //create button
        JButton addButton = new JButton("Add");
        addButton.setBounds(230, 20, 80, 30);
        frame.add(addButton);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        //jList to store task
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scroll = new JScrollPane(taskList);
        scroll.setBounds(20, 70, 290, 200);
        frame.add(scroll);

        //  Create Delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(120, 290, 100, 30);
        frame.add(deleteButton);

        // Add button action
        addButton.addActionListener(e -> {
            String task = taskField.getText();

            if (!task.equals("")) {
                listModel.addElement(task);
                taskField.setText("");
            } else
            {
                JOptionPane.showMessageDialog(frame, "Please enter a task");
            }
        });

        // Delete button action
        deleteButton.addActionListener(e -> {
            int index = taskList.getSelectedIndex();

            if (index != -1) {
                listModel.remove(index);
            }
            else {
                JOptionPane.showMessageDialog(frame, "Select a task to delete");
            }
        });

        // Show window
        frame.setVisible(true);
    }
}
