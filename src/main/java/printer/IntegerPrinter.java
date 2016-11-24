package printer;

/**
 * Created by huzefa on 11/22/16.
 */
public class IntegerPrinter implements Printer<Integer> {

    public void print(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public void printBefore(Integer[] array) {
        System.out.print("Before : ");
        print(array);
    }

    public void printAfter(Integer[] array) {
        System.out.print("After : ");
        print(array);
    }

    public void printAlgorithmName(String algorithmName) {
        System.out.println("****************************");
        System.out.println("********** " + algorithmName + " *********"); //Pretify this
        System.out.println("****************************");
    }
}
