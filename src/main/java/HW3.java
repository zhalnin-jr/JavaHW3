import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HW3 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 18, 5, 6, 7, 10, 100, 33, 11, 14, 33, 222, 37, 99, 101, 1));
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
        System.out.println("Максимальное число: " + Collections.max(arr));
        System.out.println("Минимальное число: " + Collections.min(arr));
        double sum = 0;
        for (Integer num : arr){
            sum += num.intValue();
        }
        double average = (double)sum / (double)arr.size();
        System.out.print("Среднее число у нас будет: ");
        System.out.println(Math.round(average* 100.0) / 100.0);
    }
}