package week2;
public class PlayMarbles {
    static Child child_1 =new Child(15);
    static Child child_2 =new Child(9);
    public static void simulations(){//구슬 치기를 랜덤으로 숫자를 뽑아서 그만큼 가져감.
        child_1.PlayMarbles(child_2,2);
        child_2.PlayMarbles(child_1, 7);
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
