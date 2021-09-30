package painter;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Truck extends Canvas {
    public Truck() {
        super(130, 110);
        GraphicsContext graphicsContext = this.getGraphicsContext2D();
        Painter painter = new EnglishPainterAdapter(graphicsContext);
        draw(painter);
    }

    private void draw(Painter painter) {
        painter.drawRectangle(10.5, 10.5, 70.0, 70.0);
        painter.drawRectangle(80.5, 45.5, 40.0, 35.0);
        painter.drawCircle(40.5, 80.5, 10.0);
        painter.drawCircle(100.5, 80.5, 10.0);

    }
}
