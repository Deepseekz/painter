package painter;

import javafx.scene.canvas.GraphicsContext;

public class FrenchPainter {
    GraphicsContext graphicsContext;

    public FrenchPainter(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }


    public void drawRectangle(double x, double y, double w, double h) {
        //utiliser graphicsContext.strokeRectangle
    }

    public void drawCircle(double x, double y, double radius) {
        //utiliser graphicsContext.strokeOval
    }
}
