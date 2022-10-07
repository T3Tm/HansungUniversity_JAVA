public class Rectangle {
    Point left_top=new Point();
    Point Right_bottom=new Point();
    Rectangle(){
        left_top=new Point(0,0);
        Right_bottom=new Point(0,0);
    }
    Rectangle(Point a,Point b){
        left_top=a;
        Right_bottom=b;
    }
    Rectangle(int a,int b, int c, int d){
        left_top.setXY(a, b);
        Right_bottom.setXY(c, d);
    }
    public int getCircumference(){
        int left_x1=left_top.getx();
        int left_y1=left_top.gety();
        int right_x2=Right_bottom.getx();
        int right_y2=Right_bottom.gety();
        return 2*(right_x2-left_x1 + right_y2 - left_y1);
    }
    public int getArea(){
        int left_x1=left_top.getx();
        int left_y1=left_top.gety();
        int right_x2=Right_bottom.getx();
        int right_y2=Right_bottom.gety();
        return (right_x2-left_x1)*(right_y2 - left_y1);
    }
    public int getWidth(){
        return Right_bottom.getx()-left_top.getx();
    }
    public int getHeight(){
        return Right_bottom.gety()-left_top.gety();
    }
    public void show(){
        System.out.print("[직사각형 "+Right_bottom.getx()+"x"+Right_bottom.gety());
        System.out.println(": ("+left_top.getx()+", "+left_top.gety()+"), ("+Right_bottom.getx()+", "+Right_bottom.gety()+")]");
    }
}
