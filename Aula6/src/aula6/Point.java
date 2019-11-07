
package aula6;
import java.lang.Math;
/**
 *
 * @author Turma A
 */
public class Point {
    private double x;
    private double y;
   
    
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(final double x){
        this.x=x;
    }
    public void setY(final double y){
        this.y=y;
    }
    public void setXY(final double x, final double y){
        this.x=x;
        this.y=y;
    }
    public double distanceTo (Point other){
        double resultX = other.x - this.x;
        double resultY = other.y - this.y;
        double result = Math.sqrt(Math.pow(resultX,2)+ Math.pow(resultY,2));
        return result;
    }
}
