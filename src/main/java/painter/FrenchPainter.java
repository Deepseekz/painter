package painter;

import javafx.scene.canvas.GraphicsContext;

public class FrenchPainter implements Painter{
    GraphicsContext graphicsContext;

    public FrenchPainter(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }


    public void drawRectangle(double xTopLeft, double yTopLeft, double w, double h) {
        this.graphicsContext.strokeRect(xTopLeft,yTopLeft,w,h);
    }

    public void drawCircle(double xCenter, double yCenter, double radius) {
        this.graphicsContext.strokeOval(xCenter-radius,yCenter-radius, 2*radius, 2*radius);
    }
}
