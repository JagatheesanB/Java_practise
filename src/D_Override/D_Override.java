package D_Override;

public class D_Override {
    public static <vehicle> void main(String[] args) {
        Vehicle vehicle = new Vehicle(1);
        vehicle.getColor();
        vehicle.getWheels();

        Car car = new Car();
        car.getColor();
        car.getWheels();
//       We are not accessing wheels , accessing getWheels method that method have access to wheels.

//        AUTOBOXING - primitive data type to wrapper or non primitive data type.

//        class BoxingExample1{
//            public static void main(String args[]){
//                int a=50;
//                Integer a2=new Integer(a);//Boxing
//
//                Integer a3=5;//Boxing
//
//                System.out.println(a2+" "+a3);
//            }
//        }

//         UNBOXING - Non-primitive data type to primitive data type.
//        class UnboxingExample1 {
//            public static void main(String args[]) {
//                Integer i = new Integer(50);
//                int a = i;
//
//                System.out.println(a);
//            }
//        }
        float numFloat = 100.5f;
//       Casting
        int numInt = (int) numFloat;
//        System.out.println(numInt);
// Up casting - Child class to Parent class
// Down casting - Parent class to Child class declare type cast


    }
}
