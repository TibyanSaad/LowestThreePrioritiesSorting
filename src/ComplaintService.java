import java.util.Arrays;

public class ComplaintService {
    public int[] getLowestThree(int[] priorities, SortStrategy strategy) {

        if (priorities == null || priorities.length < 3) {
            throw new IllegalArgumentException("There must be at least 3 priorities");
        }
        strategy.sort(priorities);
        return Arrays.copyOf(priorities, 3);
    }
}