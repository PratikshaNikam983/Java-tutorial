
public class RemoveDuplicates{
    public static void main(String[] args){
     int[] arr = {2,3,2,4,4,5,3};
      int n = arr.length;
      int[] temp = new int[n];
      int newIndex = 0;

      for(int i=0; i<n; i++){
        boolean isFound = false;
        for(int j=0; j<i; j++){
          if(arr[i]==arr[j]){
            isFound = true;
            break;
          }
        }
        if(!isFound){
          temp[newIndex] = arr[i];
          newIndex++;

        }

      }
      System.out.println("Array after removing duplicates: ");
      for(int i=0; i<newIndex; i++){
        System.out.print(temp[i]+" ");
      }

    
    }
}