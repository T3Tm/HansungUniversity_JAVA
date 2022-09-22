package _2;
import java.util.Random;
public class PlayMarbles {
    static Random rand=new Random();
    static Child child_1 =new Child(15);
    static Child child_2 =new Child(9);
    public static void simulations(){//구슬 치기를 랜덤으로 숫자를 뽑아서 그만큼 가져감.
        int get_child_1_from_child_2=rand.nextInt(child_2.getMarble());
        System.out.println("1번 어린이가 2번 구슬을 "+get_child_1_from_child_2+"개 따냈습니다.");
        child_1.PlayMarbles(child_2,get_child_1_from_child_2);//2번 0<=x<2번 아이가 갖고 있는 갯수
        int get_child_2_from_child_1=rand.nextInt(child_1.getMarble());//1번 0<=x<1번 아이가 갖고 있는 갯수
        System.out.println("2번 어린이가 1번 구슬을 "+get_child_2_from_child_1+"개 따냈습니다."+"\n");
        child_2.PlayMarbles(child_1, get_child_2_from_child_1);
    }
    public static void main(String[] args) {
        System.out.println("시뮬레이션 하기 전 구슬의 갯수");
        System.out.println("1번 어린이의 구슬 갯수 : "+child_1.getMarble());
        System.out.println("2번 어린이의 구슬 갯수 : "+child_2.getMarble()+"\n");
        simulations();
        System.out.println("시뮬레이션 하고 난 뒤 구슬의 갯수");
        System.out.println("1번 어린이의 구슬 갯수 : "+child_1.getMarble());
        System.out.println("2번 어린이의 구슬 갯수 : "+child_2.getMarble()+"\n");
    }
}
