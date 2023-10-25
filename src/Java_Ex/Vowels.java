package Java_Ex;

public class Vowels {
    public static void main(String[] args) {
        String name = "jagatheesan";
        String OutPut = "";
        OutPut = name.replaceAll("[aeiou]", "");
        System.out.println(OutPut);
    }
}
