public class deleteelement {
    public static void main(String[] args) {
        int arr[]={12,34,56,76,87};
        int pos=2;
        for(int i=pos;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
