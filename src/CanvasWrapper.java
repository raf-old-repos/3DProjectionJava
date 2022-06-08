import java.awt.*;

public class CanvasWrapper extends Canvas {
    public CanvasWrapper() {
        setBackground(Color.BLACK);
        setSize(400, 400);
    }

    @Override
    public void paint(Graphics g) {
        double[][] projectionMatrix = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };


        Vector3[] points = {
                new Vector3(0, 0, 0),
                new Vector3(0, 1, 0),
                new Vector3(1, 0, 0),
                new Vector3(1, 1, 0),

                // back side
                new Vector3(0, 0, 1),
                new Vector3(0, 1, 1),
                new Vector3(1, 0, 1),
                new Vector3(1, 1, 1),
        };


         /*
         * FIX
         *
         * */
        for (Vector3 p : points) {
            // resize
            p.scalarMul(50);
            var projected = Vector3.multiplyWithMatrix(p, projectionMatrix);
            g.setColor(Color.BLUE);
            //System.out.println(p);
            System.out.println(projected);
            g.drawRect((int)projected.x, (int)projected.y, 1, 1);

        }
    }





}
