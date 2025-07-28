
public class FrequencyOfArrNoRepeate{
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,3,3,4};
          boolean[] visited = new boolean[arr.length];
          for(int i=0; i<arr.length; i++){
            if(visited[i]){
                continue;
            }
            int freq = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                   freq++;
                   visited[j] = true;
                }
            }
            System.out.println("Frequency of "+arr[i]+" is "+freq);
          }

        }
    }
