package experiment;

import java.util.ArrayList;
import java.util.List;

/**
 * Wanted to check how the size() method behaves when modifying the collection
 */
public class CheckIteration {

    public void verifySizeBehavior() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        for (int i = 0; i < nums.size(); i++) {
            if (i == 10) {
                break;
            }
            System.out.println(nums.get(i));
            nums.add(i + 2);
        }
    }
}
