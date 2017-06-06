package experiment;

/**
 * Wanted to checkout the behavior of getting an object from an array, modifying it, and not putting it back there
 * Will it reflect the new changes automatically or do we have to explicitly put it back in the same
 * <p>
 * Conclusion: My hypothesis was correct. The object reference is copied to the new variable and modifying the variable
 * changed the original value
 */
public class CheckReferences {

    public void modifyAndCheck() {
        System.out.println("Creating a new array");
        MyObject[] myArray = new MyObject[5];
        myArray[0] = new MyObject(1);
        myArray[1] = new MyObject(2);
        myArray[2] = new MyObject(3);
        myArray[3] = new MyObject(4);
        myArray[4] = new MyObject(5);
        System.out.println("Values in the array are : ");
        printArray(myArray);
        System.out.println("Modifying one value ");
        MyObject temp = myArray[3];
        temp.setVal(6);
        System.out.println("Values in the array are : ");
        printArray(myArray);
    }

    public void printArray(MyObject[] array) {
        System.out.println();
        for (MyObject m : array) {
            System.out.print(m.getVal() + " ");
        }
        System.out.println();
    }

}
