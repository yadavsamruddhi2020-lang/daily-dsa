public class leftrotate {
    public static void main(String[] args) {
        int arr[]={12,3,45,33,24};
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
