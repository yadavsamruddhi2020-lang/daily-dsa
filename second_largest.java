

public class second_largest {
    public static void main(String[] args) {
        int arr[]={23,3,78,95,34,22};
        int max=arr[0];
        int second=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            
        }
        System.out.println(second);
        }
}
