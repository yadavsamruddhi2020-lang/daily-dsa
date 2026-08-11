public class swap {
    public static void main(String[] args) {
        int arr[]={12,23,43,45,55,66};
        int i=1;
        int j=3;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }
}
