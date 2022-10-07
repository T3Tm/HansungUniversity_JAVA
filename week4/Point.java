public class Point {
    private int x,y;
    public Point(){//초기화
        x=0;
        y=0;
    }
    public Point(int a, int b){
        x=a;
        y=b;
    }
    public void setXY(int a,int b) {
        x=a;
        y=b;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void show(){
        System.out.printf("현재 x,y의 좌표는 (%d,%d)\n",x,y);
    }
}
