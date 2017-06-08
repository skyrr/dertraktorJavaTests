import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by volodymyr on 07.06.17.
 */
public class Task2 {
    private String someString;
    Task2() {
    }

    Task2(String str) {
        this.someString = str;
    }

    void wordsQuantity() {
        int quantity = 0;

        System.out.println("Task 2");

        //regex for current requirements
        String regex = "\\b([a-zA-Z]{3}[A-Za-z]*+)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(someString);


        // print quantity
        while (matcher.find()) {
            quantity++;
        }

        System.out.println("The quantity of words without digits with more then 2 letters is: " + quantity);
        System.out.println("End of task 2");
        System.out.println();
    }
}
