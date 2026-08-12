public class insertelement{
    public static void main(String[] args) {
        int arr[]={12 ,34, 23,45, 67};
        int pos=2;
        int value=25;
        int newarr[]=new int[arr.length+1];
        for (int i=0;i<newarr.length;i++){
            if (i<pos){
                newarr[i]=arr[i];
            }    
            else if(i==pos){
                newarr[i]=value;
            }
            else{
                newarr[i]=arr[i-1];
            }
        }
        for(int i=0;i<newarr.length;i++){
             System.out.print(newarr[i]+" ");
        }
        
    }
}