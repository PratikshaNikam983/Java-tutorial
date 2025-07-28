
public class FindMissingNumbers{
    public static void main(String[] args){
        int[] arr = {1,3,4,7,9};
        int n = 9;

        for(int i=1; i<=n; i++){

            boolean isFound = false;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==i){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                System.out.println("Missing Numbers In Array is "+i);
            }
        }
    }
}