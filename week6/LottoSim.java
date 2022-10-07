package week6;

import java.util.Scanner;

public class LottoSim {
    public static void main(String[] args) {
        LottoCard a=new LottoCard(3);
        LottoCard b=new LottoCard();
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++) {
        	b.setLotto(i);
        }
        for(int i=0;i<5;i++) {
        	b.mLotto[i].show();
        }
        for(int i=0;i<3;i++){
            System.out.println((i+1)+"번째 복권 번호 6개를 입력해주세요.");
            int[] number=new int[6];
            for(int j=0; j<6;j++){
                number[j]=s.nextInt();
            }
            a.setLotto(i,number);
        }
        for(int i=0;i<3;i++){
            a.mLotto[i].show();
        }
        s.close();
    }
}