
public class ArrayContainSpecificElement{
    public static void main(String[] args){
      
         int[] arr = {12,23,32,63,56,14,15,45,65} ;
         int key = 45;
         boolean Found = false;
         for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
             Found = true;
             break;
            }
         }
         if(Found){
            System.out.println(key+ " is found");
         }
         else{
            System.out.println(key+" is not found");
         }


    }
}