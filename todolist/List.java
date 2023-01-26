import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    public List() {
        GridLayout layout = new GridLayout(10,1);
        layout.setVgap(5);
        this.setLayout(layout);
        this.setBackground(Color.LIGHT_GRAY);
    }
    public void indexNum() {
        Component[] listComp = this.getComponents();
        for (int i = 0; i < listComp.length; i++) {
            if (listComp[i] instanceof Task) {
                ((Task)listComp[i]).writeIndex(i + 1);
            }
        }
    }
}
