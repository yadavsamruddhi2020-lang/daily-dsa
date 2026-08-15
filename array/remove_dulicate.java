public class remove_dulicate {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,2,4};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[i]=arr[j];  
            }
        }
        for(int i=0;i<=j;i++){
            System.out.println();
        }
    }
}

