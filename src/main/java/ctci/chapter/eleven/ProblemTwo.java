package ctci.chapter.eleven;

import java.util.*;

/**
 * Write a method to sort and array such that all the anagrams are next to each other
 * We will use the hashtable approach
 */
public class ProblemTwo {

    public String[] sortAnagram(String[] inputArray) {
        Map<String, List<String>> anagramMap= new HashMap();

        //Put all the anagrams in a hashmap
        for(int i=0; i<inputArray.length; i++) {

            if(anagramMap.containsKey(sortChars(inputArray[i]))) {
                anagramMap.get(sortChars(inputArray[i])).add(inputArray[i]);
            }
            else {
                List<String> anagramList = new LinkedList();
                anagramList.add(inputArray[i]);
                anagramMap.put(sortChars(inputArray[i]), anagramList);
            }
        }

        //Put all the anagrams in the original array. It will save space
        int i =0;
        //Iterate over the map
        Iterator iter = anagramMap.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, List<String>> entry = (Map.Entry) iter.next();
            //Iterate over the list
            Iterator listIter = entry.getValue().listIterator();
            while(listIter.hasNext()) {
                inputArray[i] = (String) listIter.next();
                i++;
            }

        }

        return inputArray;

    }

    private String sortChars(String inputString) {
        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
