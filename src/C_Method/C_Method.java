package C_Method;

public class C_Method {


    public static void main(String[] args) {
        Method1 object = new Method1();
        object.method();
        object.method("OVERLOADING");

        int multiply = Method1.mul();
        System.out.println("Value : " + multiply);

    }
}

class Method1 {
    void method() {
        System.out.println("General Method call");
    }

    //    Method Overloading - same name but different parameters
    void method(String msg) {
        System.out.println(msg);
    }

    static int mul() {
        return 7 * 7;
    }
//    static -  when call from same class ,class doesn't needed .
//    Else call  from another class , class name is required!!!

}
