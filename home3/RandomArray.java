import java.util.Random;
import java.lang.Math;
public class RandomArray {

    private int[] array;

    public RandomArray() {
        array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()*101) - 50);
        }
    }

    public int[] getArray() {
        return array;
    }

    public int minElement() {
        int min;
        int i = 0;
        while (array[i] < 0 && i < array.length)
            i++;
        min = array[i];
        for (int e : array) {
            if (e > 0 && e < min) min = e;
        }
        return min;
    }

    public int[] swapNegativeToMinimal() {
        int min = minElement();
        int[] new_array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) new_array[i] = min;
            else new_array[i] = array[i];
        }
        return new_array;
    }

    public static void main(String[] args) {
        RandomArray ra = new RandomArray();
        System.out.println("Minimal element : " + ra.minElement());
        int[] new_ra = ra.swapNegativeToMinimal();
        for (int i = 0; i < 50; i++) {
            System.out.print(ra.getArray()[i] + "\t" + new_ra[i] + "\n");
        }
    }
}
