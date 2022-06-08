import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
    public static void main(String... args) {

        Frame f = new Frame("3D Projection");
        f.setSize(400, 400);
        f.setLayout(null);
        f.add(new CanvasWrapper());
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
        });



    }
}
