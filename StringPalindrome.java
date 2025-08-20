import java.util.Scanner;
public class StringPalindrome{
    public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String avr = "";
    for(int i=str.length()-1; i>=0; i--){
        avr = avr+str.charAt(i);
    }
    if(str.equals(avr)){
        System.out.println("Your String is Plindrome");
    }
  else{
     System.out.println("Your String is Not Palindrome");
  }  
    }
}