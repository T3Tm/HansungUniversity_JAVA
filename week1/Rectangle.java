public class Rectangle {
    point left_top;
    point Right_bottom;
    Rectangle(){
        left_top=new point();
        Right_bottom=new point();
    }
    public int getReactangleference(){
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
        System.out.println("현재 left_top x의 좌표는 : "+left_top.getx());
        System.out.println("현재 left_top y의 좌표는 : "+left_top.gety());
        System.out.println("현재 Right_bottom x의 좌표는 : "+Right_bottom.getx());
        System.out.println("현재 Right_bottom y의 좌표는 : "+Right_bottom.gety());
    }
}
