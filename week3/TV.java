public class TV {
    boolean status=false;
    int volume=5,channel=1;
    static final int volume_max=10,volume_min=1;
    static final int channel_max=5,channel_min=1;
    int get_volume(){
       return this.volume; 
    }
    int get_channel(){
        return this.channel;
    }
    boolean get_status(){
        return this.status;
    }
    void volumeUp() {
        if (status){
            if(volume==volume_max)System.out.println("더이상 볼륨을 올릴 수 없습니다.");
            else volume++;
        }else System.out.println("먼저 TV를 켜주세요.");
    }
    void volumeDown(){
        if (status){
            if (volume==volume_min)System.out.println("더이상 볼륨을 내릴 수 없습니다.");
            else volume--;
        }else System.out.println("먼저 TV를 켜주세요.");
    }
    void pushPower(){
        if (status){
            status=false;
            System.out.println("현재 TV는 OFF상태입니다.");
        }else{
            status=true;
            System.out.println("현재 TV는 ON상태입니다.");
        }
        
    }
    void channelUP(){
        if(status){
            if (channel==channel_max)channel=1;
            else channel++;
        }else System.out.println("먼저 TV를 켜주세요.");
    }
    void channelDown(){
        if(status){
            if (channel==channel_min)channel=5;
            else channel--;
        }else System.out.println("먼저 TV를 켜주세요.");
    }
}