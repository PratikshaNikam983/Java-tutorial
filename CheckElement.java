public class CheckElement{
    static boolean Ispresent(int[] arr, int n){
        boolean present = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                present = true;
                System.out.println("The number is present at index: "+(i+1));
                break;
            }
        }
        return present;
    }
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        boolean number = Ispresent(arr, 50);
        if(!number){
            System.out.println("Element is not present!");
        }
    }
} 