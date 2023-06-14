package Verzameling;
public class Voorbeeld {
    public static void main(String[] args) {
        
        int input = Integer.parseInt(args[0]);
        int answer = 0;
        
        switch (input) {
            case 6:
                answer = input + input - input;
                break;
            case 3:
                answer = input * input - input;
                break;
            default:
                break;
        }
        
        System.out.println(answer);
        
    }
}
