package chap13.test;

public class TruckUse {
    public static void main(String[] args) {
        Truck<String, Integer> t1 = new Truck<>();
        Truck<Integer, String> t2 = new Truck<>();

        t1.weight = "heavy";
        t1.distance = 100;

        t2.weight = 100;
        t2.distance = "장거리";

        System.out.println(t1);
        System.out.println(t2);
    }
}
