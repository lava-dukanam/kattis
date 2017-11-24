import java.util.ArrayList;
import java.util.Scanner;

public class Sibice {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        ArrayList<Integer> matches = new ArrayList<>();

        for(int i = 0; i < n; i++){
            matches.add(scanner.nextInt());
        }

        ArrayList<String> fits = new ArrayList<>();

        for (int p : matches) {
            if (p*p <= w*w + h*h){
                fits.add("DA");
            }else{
                fits.add("NE");
            }
        }

        for (String fit : fits) {
            System.out.println(fit);
        }

    }
}
