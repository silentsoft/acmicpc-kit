import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.silentsoft.stopwatch.Stopwatch;

class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        //Assertions.assertEquals(/*expected*/, /*actual*/);
        //Assertions.assertArrayEquals(/*expected*/, /*actual*/);
    }

    @Test
    public void speedTest() {
        Solution solution = new Solution();
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start("speed test", () -> {
            //
        });
        stopwatch.print();
    }
}