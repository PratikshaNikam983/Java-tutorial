
public class ArraysSum{
    public static void main(String[] args){
        int[] arr = {12,13,15,23,25,55};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of given arrays is "+sum);         
        
    }
}