import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
    private JButton addTask;
    private JButton clear;
    List list = new List();
    TitleBar title = new TitleBar();
    BthPanel bthPanel = new BthPanel();
    public AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        this.add(this.bthPanel, BorderLayout.SOUTH);
        this.add(this.list, BorderLayout.CENTER);


        addTask = bthPanel.getAddTaskBtn();
        clear = bthPanel.getClearBtn();
        addListener();

    }

    public void addListener() {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.indexNum();
                revalidate();

                JButton done = task.getDone();
                done.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.doneStatus();
                        revalidate();

                    }
                });
                JButton remove = task.getRemove();
                remove.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        list.remove(task);
                        list.indexNum();
                        revalidate();
                        repaint();
                    }
                });
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Component[] taskList = list.getComponents();
                for (int i = 0; i < taskList.length; i++) {
                    if (taskList[i] instanceof Task) {
                        list.remove((Task)taskList[i]);
                    }
                }
                revalidate();
                repaint();
            }
        });
    }
}
