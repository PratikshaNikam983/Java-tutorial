
public class CountEvenOddNumbers{
    public static void main(String[] args){
        int[] Array = {2,3,4,5,6,7,8};
        int even = 0;
        int odd = 0;
        for(int i=0; i<Array.length; i++){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}