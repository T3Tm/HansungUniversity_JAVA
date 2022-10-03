package week2;
public class Child {
    private int marble;
    Child(){//아무것도 안 넣었을 때는 0
        this.marble=0;
    }
    Child(int number){// 개수를 넣어줬을 때는 그것으로 초기화 해준다.
        this.marble=number;
    }
    public void Show(){
        System.out.println("현재 가지고 있는 구슬의 수는 -->"+marble+"개 입니다.");
    }
    public int getMarble(){
        return marble;
    }
    public void setMarble(int marble){
        this.marble=marble;
    }
    public void winner(int number){//승자면
        marble+=number;
    }
    public void loser(int number){
        marble-=number;
    }
    public void PlayMarbles(Child a,int number){
        winner(number);
        a.loser(number);
    }
}
