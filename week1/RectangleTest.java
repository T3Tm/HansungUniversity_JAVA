import java.util.*;
public class RectangleTest {
    static Scanner s = new Scanner(System.in);
    public static void menu(){
        System.out.println("1. 둘레를 구하기.");
        System.out.println("2. 넓이를 구하기.");
        System.out.println("3. 왼쪽 좌표 설정하기");
        System.out.println("4. 오른쪽 좌표 설정하기");
        System.out.print("5. 종료하기.");
        System.out.print(" --> ");
    }
    public static void LeftPointSet(Rectangle t){
        System.out.print("x 좌표 : ");
        int a=s.nextInt();
        System.out.print("y 좌표 : ");
        int b=s.nextInt();
        t.left_top.setXY(a, b);
    }
    public static void RightPointSet(Rectangle t){
        System.out.print("x 좌표 : ");
        int a=s.nextInt();
        System.out.print("y 좌표 : ");
        int b=s.nextInt();
        t.Right_bottom.setXY(a, b);
    }
    
    public static void process(){
        Rectangle t = new Rectangle();
        int a=0;
        while(a!=5){
            menu();
            a=s.nextInt();
            switch(a){
                case 1:
                    System.out.println(t.getReactangleference());
                    break;
                case 2:
                    System.out.println(t.getArea());
                    break;
                case 3:
                    LeftPointSet(t);
                    break;
                case 4:
                    RightPointSet(t);
                    break;
            }
        }
            
    }
    public static void main(String[] args) {
        process();
    }
}
