package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;

public class CircleAdapter implements Shape {

    private Circle adapeter;

    public CircleAdapter(Circle circ) { this.adapeter = circ; }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int diameter = Math.abs(x2-x1);
        int radius = diameter/2;
        adapeter.draw(x1, y1, radius);
    }
}
