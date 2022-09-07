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
        center_x = 0;
        center_y = 0;
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
            Sprite player2 = null;
            //System.out.println(player2.center_x); // NullPointerException
            Sprite player3;
            //System.out.println(player3.center_x);// error! Player3 is not initialized
        }
}