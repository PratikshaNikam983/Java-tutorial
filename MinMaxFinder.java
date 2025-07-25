
public class MinMaxFinder{
    public static void main(String[] args){
        int[] array = {20,45,49,38,16,48,67,22,9,57,89};
        int max = array[0];
        int min = array[0];
        
        for(int i=1; i<array.length; i++){
            if(max<array[i]){
            max = array[i];
            
            }
            if(min>array[i]){
                min = array[i];
            }

        }
        System.out.println("Largest number in array is : "+max);
        System.out.println("Smallest number in array is : "+min);
    }
}