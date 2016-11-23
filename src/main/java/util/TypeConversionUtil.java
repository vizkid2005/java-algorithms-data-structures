package util;

/**
 * Used to convert primitives to their corresponding objects
 * This class could have been avoided but I wanted to show off the use of generics in the Printer Interface ;-)
 */
public class TypeConversionUtil {

    public static Integer[] convertIntArrayToIntegerArray(int[] primitiveArray) {
        Integer[] integerArray = new Integer[primitiveArray.length];

        for (int i = 0; i < primitiveArray.length; i++) {
            integerArray[i] = Integer.valueOf(primitiveArray[i]);
        }
        return integerArray;
    }

}
