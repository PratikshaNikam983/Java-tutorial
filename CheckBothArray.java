
public class CheckBothArray{
    public static void main(String[] args){
        int[] arr1 = {2,3,5,7,2};
        int[] arr2 = {2,3,6,7,2,7};
         
        if(arr1.length!=arr2.length){
           System.out.println("compare their length ");
        }
        else{
            boolean isSame = true;
             for(int i=0; i<arr1.length; i++){
               
                   if(arr1[i]!=arr2[i]){
                    System.out.println("Array is not same");
                    isSame = false;
                    break;
                   }
             }  
             if(isSame){
            System.out.println("Congrats your Array is same");
        }  
        }
        
    }
}