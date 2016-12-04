package ctci.chapter.eleven;

import org.testng.annotations.Test;

/**
 * Test Chapter 11 Problem 2
 */
public class ProblemTwoTest {

    @Test
    public void testChapterElevenProblemTwo() {

        ProblemTwo problemTwo = new ProblemTwo();

        String[] stringArray = {"iceman", "listen" ,"cinema", "silent" };
        stringArray = problemTwo.sortAnagram(stringArray);
        for(int i =0; i<stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
    }
}
