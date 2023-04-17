import org.junit.Assert;

import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

public class Test {
  public static Map<Integer[], Integer> data = Map.ofEntries(
          entry(new Integer[]{-1, -1, -1, 2}, 1)
  );

  @org.junit.Test
  public void test() {
    Task task = new Task();
    for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
      Integer[] input = entry.getKey();
      Integer expected = entry.getValue();
      Integer actual = task.countPairs(input, 0);
      Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
    }
  }
}