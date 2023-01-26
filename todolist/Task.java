import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private JLabel index;
    private JTextField taskName;
    private JButton done;
    private JButton remove;
    public Task() {
        GridLayout  layout = new GridLayout(1, 4);
        layout.setHgap(5);
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(new Color(255, 234, 17));
        this.setLayout(layout);


        index = new JLabel(" ");
        index.setPreferredSize(new Dimension(10, 20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255, 234, 17));
        this.add(this.index);

        taskName = new JTextField("Enter Task");
        taskName.setPreferredSize(new Dimension(10, 20));
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(new Color(255, 234, 17));
        this.add(taskName);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(10, 20));
        this.add(this.done);

        remove = new JButton("Remove");
        remove.setPreferredSize(new Dimension(10 ,20));
        this.add(this.remove);
    }
    public void writeIndex(int n) {
        this.index.setText(String.valueOf(n));
        this.revalidate();

    }
    public JButton getDone() {
        return this.done;
    }

    public JButton getRemove() {
        return this.remove;
    }

    public void doneStatus() {
        this.taskName.setBackground(Color.green);
        this.index.setBackground(Color.green);
        this.remove.setBackground(Color.green);
        this.done.setBackground(Color.green);
        this.setBackground(Color.green);
        revalidate();
    }
}
