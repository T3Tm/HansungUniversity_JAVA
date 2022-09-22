
public class point {
    private int x,y;
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
        System.out.println("x의 좌표는 : "+x+"y의 좌표는 : "+y);
    }
}
