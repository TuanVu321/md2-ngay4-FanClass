public class Running {
    public static void main(String[] args) {
        Fan fan1 = new Fan(10,"yellow");
        Fan fan2 = new Fan();
        fan1.turnOn();
        fan1.changeSpeed(3);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
