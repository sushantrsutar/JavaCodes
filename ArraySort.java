import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array={1,4,7,8,2,0,3};
        Arrays.sort(array);
       // System.out.print(Arrays.toString(array));
        for (int i:array) {
            System.out.print(i+" ");
        }

    }
}
