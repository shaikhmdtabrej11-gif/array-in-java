import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        int[] result = Arrays.stream(arr)
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}
