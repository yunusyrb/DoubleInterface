package javaapplication19;

/**
 *
 * @author esra
 */
public class ResizableCircle extends Circle implements Resizable{
    
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double Resize(int yuzde) {
        return radius+=(radius*yuzde/100);
    }
    
}
