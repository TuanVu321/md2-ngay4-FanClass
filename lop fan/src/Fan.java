public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Fan() {

    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        on = false;
    }

    public String result() {
        if (on == true) {
            return "Fan is on";
        } else {
            return "Fan is off";
        }
    }

    public String changeColor(String color) {
        return this.color = color;
    }

    public double changeRadius(double radius) {
        return this.radius = radius;
    }

    public int changeSpeed(int speed) {
        return this.speed = speed;
    }
public String resultSpeed(){
        if(this.speed==Slow){
            return "SLOW";
        }else{
            if(this.speed==Medium){
                return "MEDIUM";
            }else{
                return "FAST";
            }
        }
}
    public String toString() {
        return "mau sac: " + this.color + " toc do: " + resultSpeed() + " ban kinh quat: " + this.radius + " trang thai quat: " + result();
    }

}
