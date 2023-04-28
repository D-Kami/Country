import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> kraj_stolica = new HashMap<String, String>();


        System.out.println("Podaj kraj i stolice (znak '/' konczy)");

        String[] input;

        do {
            input = scanner.nextLine().split(" ");
            if (input.length == 2)
                kraj_stolica.put(input[0], input[1]);
        }
            while (!input[0].equals("/")) ;

        System.out.println("Podaj kraj aby wyswietlic stolice");
        String nameToFind = scanner.nextLine();
        if (kraj_stolica.containsKey(nameToFind)) {
            System.out.println("Panstwo: " + nameToFind + " Stolica: " + kraj_stolica);
        } else
            System.out.println("nie ma stolicy dla : " + nameToFind);


    }
    }

