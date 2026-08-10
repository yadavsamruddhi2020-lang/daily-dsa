public class multidimensional_arr {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
               nums[i][j]=(int)(Math.random()*100);
               System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}




// public class multidimensional_arr{
//     public static void main(String[] args) {
//         int nums[][][]=new int [3][4][2];
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 for (int k = 0; k < nums[i][j].length; k++) {
//                     nums[i][j][k] = (int) (Math.random() * 100);
//                     System.out.print(nums[i][j][k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
// }
