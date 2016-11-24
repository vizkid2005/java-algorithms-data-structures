package printer;

/**
 * Using Generics to allow implementation of printing an array of any kind
 */
public interface Printer<E> {
    void print(E[] array);

    void printBefore(E[] array);
    void printAfter(E[] array);
    void printAlgorithmName(String algorithmName);
}
