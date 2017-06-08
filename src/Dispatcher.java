/**
 * Created by volodymyr on 07.06.17.
 */
public class Dispatcher {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.printSymbols();


        Task2 task2 = new Task2("This just 12, is AfdsfsdA 1213fsdf");
        task2.wordsQuantity();


        Task3 task3 = new Task3();
        task3.calculateAngle(6, 0);
    }


}