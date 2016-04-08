import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Monil on 4/6/16.
 *
 * Print number combinations using set of numbers
 * Constraints: 1. No duplicate numbers in set.
 *              2. {1,2} is same as {2,1}. No need to print twice.
 *
 *
 * Sample input : {1,2,3,4}
 * Sample output :   {}
                     {1}
                     {2}
                     {3}
                     {4}
                     {1,2}
                     {1,3}
                     {1,4}
                     {2,3}
                     {2,4}
                     {3,4}
                     {1,2,3}
                     {1,2,4}
                     {1,3,4}
                     {2,3,4}
                     {1,2,3,4}
 *
 */
public class PermutationOfSet {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        printPermutations(numbers);

    }

    private static void printPermutations(int[] numbers) {
        Queue<SetEntry> queue = new LinkedList();

        // print empty set and add it to queue
        System.out.println("{}");
        queue.add(new SetEntry(-1, ""));

        while(!queue.isEmpty()) {
            // remove item from queue
            SetEntry entry = queue.remove();

            for (int i = entry.lastAddIndex + 1; i < numbers.length; i++) {
                // print combination of queue item and current array number
                System.out.println("{" + entry.permutes + ((entry.permutes.length() > 0)? ",":"") + numbers[i] + "}");

                // add new combination to queue for consideration in next iteration
                queue.add(new SetEntry(i, entry.permutes + ((entry.permutes.length() > 0)? ",":"") + numbers[i]));
            }

        }

    }
}

// structure for storing information in queue
class SetEntry {
    String permutes;
    int lastAddIndex;

    public SetEntry(int lastAddIndex, String permutes) {
        this.lastAddIndex = lastAddIndex;
        this.permutes = permutes;
    }
}
