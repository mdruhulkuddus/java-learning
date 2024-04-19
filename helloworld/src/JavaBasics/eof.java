package JavaBasics;
import java.util.Scanner;
public class eof {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            for(int i = 1; sc.hasNext()== true; i++){
                System.out.println(i + " " + sc.nextLine());
            }
        }

}
