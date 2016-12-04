package ctci.chapter.eleven;

/**
 * You are given 2 sorted arrays A and B. A has large enough buffer at the end to hold B
 * Write a method to merge A and B into A in sorted order.
 */
public class ProblemOne {

    public int[] merge(int[] bigArray, int[] smallArray, int lastOfBigArray, int lastOfSmallArray) {

        int bigArrayEnd = bigArray.length - 1;
        int smallArrayPointer = smallArray.length - 1;

        while(lastOfSmallArray > -1) {
            if(smallArray[lastOfSmallArray] > bigArray[lastOfBigArray]) {
                bigArray[bigArrayEnd] = smallArray[lastOfSmallArray];
                lastOfSmallArray--;
            }
            else {
                bigArray[bigArrayEnd] = bigArray[lastOfBigArray];
                lastOfBigArray--;
            }
            bigArrayEnd--;
        }

        return bigArray;
    }
}
