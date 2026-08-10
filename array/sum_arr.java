
public class sum_arr {
    public static void main(String[] args) {
        int arr[]={23,45,76,22,34,85};
        int sum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
