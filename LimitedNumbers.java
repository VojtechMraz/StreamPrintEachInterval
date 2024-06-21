
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();           
            int i = Integer.valueOf(input);
            
            if(i < 0){
                break;
            }
            
            list.add(i);          
        }
        
        list.stream()
               .filter(j -> j >= 1 && j <= 5)
               .forEach(System.out::println);
        //Trochu jinak
        //list.stream().filter(j -> j >= 1 && j <= 5).forEach(j -> System.out.println(j));
    }
}
