 
public class SecondLargest{
    public static void main(String[] args){
        int[] arr = {5,28,45,23,45,3,76,24,56,32};
        int largest = arr[0];
        int smallest = arr[0];
        int secondlargest =arr[0];
        int secondsmallest = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]>largest){
               
                largest = arr[i];
            }
           else if(arr[i]>secondlargest && arr[i]!=largest){
            secondlargest = arr[i];
           }
           else if(arr[i]<smallest){
            smallest = arr[i];
           }
           else if(arr[i]<secondsmallest && arr[i]!=smallest){
            secondsmallest = arr[i];
           }
        }
        System.out.println("Largest number in array is "+largest);
        System.out.println("Secondlargest number in Array is "+ secondlargest);
        System.out.println("smallest number in Array is "+ smallest);
        System.out.println("Secondsmallest number in Array is "+ secondsmallest);
    }
    }
    
