package ctci.chapter.eleven;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by huzefa on 11/28/16.
 */
public class ProblemOneTest {

    @Test
    public void testChapterElevenProblemOne() {
        ProblemOne problemOne = new ProblemOne();


        int[] bigArray = {1,11,21,31,41,0,0,0,0,0};
        int[] smallArray = {10,20,30, 40,50};

        bigArray = problemOne.merge(bigArray, smallArray, 4, 4);

        for(int i =1; i<bigArray.length;i++) {
            Assert.assertTrue(bigArray[i] > bigArray[i-1]);
        }
    }


}
