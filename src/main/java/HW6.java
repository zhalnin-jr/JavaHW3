import java.util.HashMap;

public class HW6 {
    private static HashMap<Integer, Object> hashMap = new HashMap<>();
    private static final Object PRESENT = new Object();

    public static void main(String[] args) {
        add(11);
        add(9);
        add(33);
        add(44);
        add(55);

        System.out.println(getString());

        System.out.println(getElementByKey(11));
        System.out.println(getElementByKey(20));
    }

    private static Object getElementByKey(int key) {
        return hashMap.get(key);
    }

    private static String getString() {
        return hashMap.keySet().toString();
    }

    public static void add(Integer number) {
        hashMap.put(number, PRESENT);
    }
}