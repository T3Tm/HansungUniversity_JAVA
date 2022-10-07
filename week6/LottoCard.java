package week6;
public class LottoCard {
    Lotto[] mLotto; //로또
    int mEffNum;// 로또 카드가 몇개
    LottoCard(){
        mLotto=new Lotto[5];
        mEffNum=5;
    }
    LottoCard(int n){
        mLotto=new Lotto[n];
        mEffNum=n;
    }
    public void setLotto(int number,int a,int b,int c, int d,int e,int f){//몇 번 카드의 번호를 수동 설정
        mLotto[number]=new Lotto(a,b,c,d,e,f); //해당 번호에 
    }
    public void setLotto(int number){ // 해당 번호에 자동 생성.
        mLotto[number]=new Lotto();
    }
    public void setLotto(int number,int numbers[]){
        mLotto[number]=new Lotto(numbers);
    }
}