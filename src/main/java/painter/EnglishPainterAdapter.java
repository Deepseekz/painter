package painter;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import org.info.painter.EnglishPainter;

import java.awt.*;

public class EnglishPainterAdapter implements Painter{
    EnglishPainter englishPainter;

    public EnglishPainterAdapter(GraphicsContext graphicsContext) {
        englishPainter = new EnglishPainter(graphicsContext);
    }

    @Override
    public void drawRectangle(double x, double y, double w, double h) {
        Point2D topLeftPoint = new Point2D(x, y);
        Point2D bottomRightPoint = new Point2D(x+w, y-h);

        englishPainter.paintRectangle(topLeftPoint, bottomRightPoint);
    }

    @Override
    public void drawCircle(double x, double y, double radius) {
        Point2D centerPoint = new Point2D(x+radius, y-radius);

        englishPainter.pa(centerPoint, );
    }
}
