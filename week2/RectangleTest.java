package week2;
import java.util.*;
public class RectangleTest {
    static Scanner s = new Scanner(System.in);
    // public static void menu(){
    //     System.out.println("1. 둘레를 구하기.");
    //     System.out.println("2. 넓이를 구하기.");
    //     System.out.println("3. 왼쪽 좌표 설정하기");
    //     System.out.println("4. 오른쪽 좌표 설정하기");
    //     System.out.print("5. 종료하기.");
    //     System.out.print(" --> ");
    // }
    // public static void LeftPointSet(Rectangle t){
    //     System.out.print("x 좌표 : ");
    //     int a=s.nextInt();
    //     System.out.print("y 좌표 : ");
    //     int b=s.nextInt();
    //     t.left_top.setXY(a, b);
    // }
    // public static void RightPointSet(Rectangle t){
    //     System.out.print("x 좌표 : ");
    //     int a=s.nextInt();
    //     System.out.print("y 좌표 : ");
    //     int b=s.nextInt();
    //     t.Right_bottom.setXY(a, b);
    // }
    public static void close(){
        System.out.println("프로그램을 종료합니다.");
    }
    public static void show(Rectangle r){
        r.show();
        System.out.print("넓이 : "+ r.getArea());
        System.out.print(" , ");
        System.out.println("둘레 : "+ r.getCircumference());
    }
    public static void process(){
        Rectangle rect1 = new Rectangle(0,0,10,5);
        RectangleTest.show(rect1);
        System.out.println();

        Rectangle rect2 = new Rectangle(new Point(0,0),new Point(5,10));
        RectangleTest.show(rect2);
        // int a=0;
        // boolean case1=false,case2=false;
        // while(a!=5){
        //     menu();
        //     a=s.nextInt();
        //     switch(a){
        //         case 1:
        //             if (case1 && case2)System.out.println(t.getReactangleference());
        //             else System.out.println("좌표를 먼저 설정해주세요.\n");
        //             break;
        //         case 2:
        //             if (case1 && case2)System.out.println(t.getArea());
        //             else System.out.println("좌표를 먼저 설정해주세요.\n");
        //             break;
        //         case 3:
        //             LeftPointSet(t);
        //             case1=true;
        //             break;
        //         case 4:
        //             RightPointSet(t);
        //             case2=true;
        //             break;
        //     }
        // }
        // close();
    }
    public static void main(String[] args) {
        process();
    }
}
