package NewDrawingSys;

import com.mycompany.oldDrawingSys.Rectangle;

public class RectangleAdapter implements Shape{

    private Rectangle adapeter;

    public RectangleAdapter(Rectangle rect){
        this.adapeter = rect;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x2-x1);
        int height = Math.abs(y2-y1);
        int x = Math.min(x1,x2);
        int y = Math.min(y1,y2);
        adapeter.draw(x,y,width, height);
    }
}
