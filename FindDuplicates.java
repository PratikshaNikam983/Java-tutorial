
public class FindDuplicates{
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,5,5};
        for (int i=0; i<arr.length; i++){
             boolean isFound = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                  isFound = true;
                }
            }
            if(isFound){
                System.out.println("duplicate Element: "+arr[i]);
            }
        }
    }
}