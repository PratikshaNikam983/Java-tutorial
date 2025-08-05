
public class SwapZero{
        static void AddzeroAtEnd(int[] arr){
       
        int nonzero = 0;
       
        for(int i=0; i<arr.length; i++){
           if(arr[i]!=0){
            arr[nonzero] = arr[i];
            nonzero++;
           }
      }
        while(nonzero<arr.length){
            arr[nonzero] = 0;
            nonzero++;
        }
        }
        public static void main(String[] args){
            int[] arr = {1,0,2,0,3,0,4,5};
            AddzeroAtEnd(arr);
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        }
}