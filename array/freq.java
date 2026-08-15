public class freq {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,2};
        for(int i=0;i<arr.length;i++){// This loop iterates through each element of the array 'arr' using the index 'i'.
            int count=0;
            for (int j=0;j<arr.length;j++){  // This nested loop iterates through the array again using the index 'j' to compare each element with the current element at index 'i'.
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            boolean alreadycounted=false; // This boolean variable is used to check if the current element has already been counted in previous iterations.
            for(int k=0;k<i;k++){// This loop checks all the elements before the current index 'i' to see if the current element has already been counted.
                if(arr[i]==arr[k]){
                    alreadycounted=true;
                    break;
                }
            }
            if(!alreadycounted){
                System.out.println(arr[i]+"="+count);
            }
        }
    }
}
//explain this code 

// This code calculates the frequency of each element in an array.
