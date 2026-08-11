public class searchelement {
    public static void main(String[] args) {
        int arr[]={12, 34,54,22,77,56,78};
        int target=77;
        for(int i=0;i<arr.length;i++){
           if (arr[i]==target){
            System.out.println(i);
            break;
           }
        }
    }
}
