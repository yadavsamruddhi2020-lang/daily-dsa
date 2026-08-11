// public class countevenodd {
//     public static void main(String[] args) {
//         int arr[]={12,23,44,66,54,33,27};
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] % 2 == 0){
//                 count++;
//             }
//         }
//         System.out.print("even nums are:" + count);
//     }
// }


public class countevenodd{
    public static void main(String[] args) {
        int arr[]={12,33,45,67,88,24};
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }
        System.out.print("odd nums are:" + count);
    }
}