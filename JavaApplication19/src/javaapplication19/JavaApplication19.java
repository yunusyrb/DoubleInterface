package javaapplication19;

/**
 *
 * @author esra
 */
public class JavaApplication19 {

    public static void main(String[] args) {
        ResizableCircle rc=new ResizableCircle(5);
        System.out.println(rc.radius);
        rc.Resize(25);
        System.out.println(rc.radius);
    }
    
}
