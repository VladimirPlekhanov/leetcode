package jewelsAndStones;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewelsArray[i] == stonesArray[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

}
