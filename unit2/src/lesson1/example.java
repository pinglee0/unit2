package lesson1;

class Ipod{
    String current_song;
    int volume;
    double battery_life;
    Ipod(String c_s,int v,double b_life){
        current_song=c_s;
        volume=v;
        battery_life=b_life;
    }
    void power_on_off(){

    }
    void change_song(){

    }
    void change_volume(int c_v){
        volume+=c_v;
    }
    void random_song(){

    }
}
public class example {
    public static void main(String[] args){
    Ipod ipod1=new Ipod("Lemon Tree",17,2.5);
    System.out.println("current_song: "+ipod1.current_song+"\nvolume: "
            + ipod1.volume+"\nbattery_life:"+ipod1.battery_life);
    ipod1.change_volume(-5);
    System.out.println("\ncurrent_song: "+ipod1.current_song+"\nvolume: "
        + ipod1.volume+"\nbattery_life:"+ipod1.battery_life);
    }

}
//example2
class Sprite{
    double center_x;
    double center_y;
    public Sprite(){
        center_x = 10;
        center_y = 10;
    }
    public Sprite(double x, double y){
        center_x = x;
        center_y = y;
    }
}
class example2 {
        public static void main(String[] args){
            Sprite player1 = new Sprite(100, 200);
            System.out.println(player1.center_x);
            player1 = new Sprite(1,2);
            Sprite player2 = null;
            //player2.center_x=30;// NullPointerException
            player2=new Sprite();
            player2.center_x=30;
            System.out.println(player2.center_x);
            int a;
            String a2;
            Sprite player3;
            //player3.center_x=30;// error! Player3 is not initialized
            player3=new Sprite(100, 200);
            a=2;
            a2="as ,d\\";
            System.out.println(a2);
            player3.center_x=130;
            System.out.println(player3.center_x);
        }
}
