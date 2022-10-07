package week6;

import java.util.*;
public class Lotto {
    int[] lottoNumber;
    static final int max_size=6;
    boolean isValid;
    Lotto(){
        lottoNumber=new int[max_size];
        generate();
    }
    Lotto(int a, int b,int c,int d,int e,int f){
        lottoNumber=new int[max_size];
        lottoNumber[0]=a;
        lottoNumber[1]=b;
        lottoNumber[2]=c;
        lottoNumber[3]=d;
        lottoNumber[4]=e;
        lottoNumber[5]=f;
        verify(lottoNumber);//유효한지 검사
    }
    Lotto(int a[]){
        lottoNumber=new int[max_size];
        int idx=0;
        for(int number:a){
            lottoNumber[idx++]=number;
        }
        verify(lottoNumber);
    }
    public void generate(){
        Random r=new Random();
        for(int i=0;i<max_size;i++){
            int value=r.nextInt(44)+1;
            for(int j=0;j<i;j++){
                if(lottoNumber[j]==value){
                    value=r.nextInt(44)+1;
                    j=0;
                }
            }
            lottoNumber[i]=value;
        }
        verify(lottoNumber);
    }
    public void verify(int[] number){
        for(int i=0;i<max_size;i++){
            for(int j=i+1;j<max_size;j++){
                if(number[i]==number[j]){
                    isValid=false;
                    return;
                }
            }
        }
        isValid=true;
    }
    public void show(){
        if(isValid){
            System.out.print("로또 번호는 => ");
            for(int number:lottoNumber){
                System.out.print(number+" ");
            }
            System.out.println();
        }else{
            System.out.println("유효하지 않은 로또번호입니다.");
        }
        
    }
    public int[] getNumbers(){
        if(isValid){
            return lottoNumber;
        }else{
            return null;
        }
    }
}