import java.util.Scanner;
public class TVUser {
    public static void menu(){
        System.out.println("1. 전원버튼 누르기");
        System.out.println("2. 채널을 하나 올리기");
        System.out.println("3. 채널을 하나 내리기");
        System.out.println("4. 볼륨을 높이기");
        System.out.println("5. 볼륨을 내리기");
        System.out.println("6. 종료하기");
        System.out.print("번호를 입력해주세요 --> ");
    }
    public static void pre_status_print(TV temp){
        if(temp.get_status()){
            System.out.println("현재 볼륨은 "+ temp.get_volume()+"입니다.");
            System.out.println("현재 채널은 "+ temp.get_channel()+"입니다.");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TV H=new TV();
        while(true){
            menu();
            int a=s.nextInt();
            if (a==1){
                H.pushPower();
            }else if(a==2){
                H.channelUP();
            }else if(a==3){
                H.channelDown();
            }else if(a==4){
                H.volumeUp();
            }else if(a==5){
                H.volumeDown();
            }else if(a==6){
                System.out.println("종료합니다.");
                break;
            }
            pre_status_print(H);
        }
        s.close();
    }
}