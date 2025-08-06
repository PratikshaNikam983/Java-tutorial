
public class MergedSortedArray{
    static int[]  mergedsortedarray(int[] arr1 , int[] arr2){
        int[] merged = new int[arr1.length+arr2.length];

        int index = 0;
        int i=0;
        int j=0;
    
    while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            merged[index] = arr1[i];
            index++;
            i++;
        }
        else{
            merged[index] = arr2[j];
            index++;
            j++;

        }
    }
        while(i<arr1.length){
            merged[index] = arr1[i];
            index++;
            i++;

        }
        while(j<arr2.length){
            merged[index] = arr2[j];
            index++;
            j++;
        }
    
    return merged;
    }
    public static void main(String[] args){
        int[] arr1 = {2,5,6,9,10};
        int[] arr2 = {1,3,4,7,8};

        int[] result = new int[arr1.length+arr2.length];
        result = mergedsortedarray(arr1,arr2);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
}
