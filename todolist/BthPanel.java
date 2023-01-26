import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BthPanel extends JPanel {
    private JButton addTask;
    private JButton clear;
    Border emptyBorder = BorderFactory.createEmptyBorder();

    public BthPanel() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.white);

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear All Task");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        this.add(clear);
    }
    public JButton getAddTaskBtn() {
        return addTask;
    }
    public JButton getClearBtn() {
        return clear;
    }
}
