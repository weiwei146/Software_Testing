import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class checkScoreStudentTest {

    @Test
    public void test1() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("Tin", 41, 8);
        assertEquals("Đỗ tin", result);
    }

    @Test
    public void test2() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("Toán", 42, 8.5);
        assertEquals("Đỗ toán", result);
    }

    @Test
    public void test3() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("", 44, 9);
        assertEquals("Đỗ toán", result);
    }

    @Test
    public void test4() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("", 42, 8.25);
        assertEquals("Đỗ tin", result);
    }

    @Test
    public void test5() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("", 41.5, 9);
        assertEquals("Đỗ tin", result);
    }
}
