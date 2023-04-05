package CodeChallage1;

public class FizzBuzz {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            String word = "";
            if(i%3 == 0) {
                word += "FIZZ";
            }
            if(i%5 == 0){
                word += "BUZZ";
            }
            if(word.isEmpty())
                System.out.println(i);
            else
                System.out.println(word);
        word = "";
        }
    }
}
