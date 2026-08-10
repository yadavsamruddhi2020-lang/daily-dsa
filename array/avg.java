

public class avg {
    public static void main(String[] args) {

        int arr[] = {23, 45, 22, 12, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int avg =  sum / arr.length;

        System.out.println(avg);
    }
}