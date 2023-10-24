package B_Class;

public class Another {
    void traffic() {
        System.out.println("RED");
        System.out.println("YELLOW");
        System.out.println("GREEN");
    }

    void rules() {
        System.out.println("DDD");
        System.out.println("Don't Overtake");
    }

    public static void main(String[] args) {
        Another Signal = new Another();
        Signal.traffic();
        Signal.rules();

    }
}
