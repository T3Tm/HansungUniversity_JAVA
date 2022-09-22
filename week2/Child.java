package _2;

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
        return this.marble;
    }
    public void setMarble(int number){
        this.marble=number;
    }
    public void PlayMarbles(Child a,int number){
        int Yourmarble=a.getMarble();
        if (Yourmarble-number<=0){// 개수 옮기려 하는데 상대방의 갯수가 음수가 될 수 없음
            this.marble+=Yourmarble; //내 구슬에 상대방의 구슬 더해서 넣어줘야함. 예를 들어) 상대방의 구슬이 1개 였을 시 1-2 <0 음수이므로 상대방은
            a.setMarble(0);//자신의 것을 다 줘야하기에 0개가 된다.
        }else{
            this.marble+=number;//음수가 되지 않기에 number만큼만 더해주면 된다.
            a.setMarble(Yourmarble-number);//개수만큼 줄어들어야한다.
        }
    }
}
