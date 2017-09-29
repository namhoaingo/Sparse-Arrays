import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int stringCount = 0;
        stringCount = scanner.nextInt();

        String[] inputStringArrays = new String[stringCount];
        int index = 0;
        String line;
        scanner.nextLine();

        while (index < stringCount){
            line = scanner.nextLine();
            inputStringArrays[index] = line;
            index++;
        }

        int stringCount2 = 0;
        stringCount2 = scanner.nextInt();

        String[] searchString = new String[stringCount2];
        index = 0;
        String line2;
        scanner.nextLine();

        while (index < stringCount2){
            line2 = scanner.nextLine();
            searchString[index] = line2;
            index++;
        }
        scanner.close();
        matchString(inputStringArrays, searchString);
    }

    public static void matchString(String[] inputString, String[] searchString){
        // use regular expression
        String masterString = "_" + String.join("__", inputString) + "_";

        System.out.println(masterString);
        for(String item: searchString) {
            String searchItem = "_"+ item + "_";
            System.out.println(searchItem);
            Pattern pattern = Pattern.compile(searchItem);
            Matcher matcher = pattern.matcher(masterString);
            int count = 0;
            while (matcher.find()){
                count++;
            }
            System.out.println(count);
        }
    }
}
