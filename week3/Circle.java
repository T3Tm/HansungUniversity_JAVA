import java.util.*;
public class Circle {
    static final double PI=3.141592;
    double radius;
    void setRadius(double radius){
        this.radius=radius;
    }
    double getRadius(){
        return this.radius;
    }
    double getArea(){
        return this.radius*this.radius*PI;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Circle n1=new Circle();
        n1.setRadius(s.nextDouble());
        System.out.println(n1.getArea());
        s.close();
    }
}