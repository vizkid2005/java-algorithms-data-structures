package printer;

/**
 * Created by huzefa on 11/22/16.
 */
public class IntegerPrinter<E> implements Printer<E> {

    public void print(E[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public void printBefore(E[] array) {
        System.out.print("Before : ");
        print(array);
    }

    public void printAfter(E[] array) {
        System.out.print("After : ");
        print(array);
    }

    public void printAlgorithmName(String algorithmName) {
        System.out.println("****************************");
        System.out.println("********** " + algorithmName + " *********"); //Pretify this
        System.out.println("****************************");
    }
}
