package other.findDuplicates;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public int[][] findDuplicates(int[] array) {
        Map<Integer, Integer> duplicatesMap = new HashMap<>();
        for (int i : array) {
            if (!duplicatesMap.containsKey(i)) {
                duplicatesMap.put(i, 1);
            } else {
                duplicatesMap.put(i, duplicatesMap.get(i) + 1);
            }
        }

        duplicatesMap.values().removeIf(value -> value.equals(1));

        int[][] duplicates = new int[duplicatesMap.size()][2];
        int counter = 0;

        for (Map.Entry<Integer, Integer> entry : duplicatesMap.entrySet()) {
            duplicates[counter][0] = entry.getKey();
            duplicates[counter][1] = entry.getValue();
            counter++;
        }

        return duplicates;
    }

}
