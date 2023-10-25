package J_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class J_Set {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
//        Treeset - to sort order wise or ascending
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add(null);

        System.out.println("<------For Loop------>");
        for(String i :cars){
            System.out.println(i);
        }

        System.out.println("<------Iterator------>");
        Iterator<String>iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



}
