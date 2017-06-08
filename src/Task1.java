/**
 * Created by volodymyr on 07.06.17.
 */
class Task1 {
    void printSymbols() {
        int symbols;

        System.out.println("Task 1");
        for (symbols = 1; symbols<=255; symbols++) {
            if (symbols % 3 == 0 && symbols % 5 == 0) {
                System.out.println("foobar");
            } else if (symbols % 5 == 0) {
                System.out.println("bar");
            } else if (symbols % 3 == 0) {
                System.out.println("foo");
            } else {
                System.out.println(symbols);
            }
        }
        System.out.println("End of task 1");
        System.out.println();
    }
}