import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class checkScoreStudentTest {

    @Test
    public void test1() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("Toán", 42, 8.5);
        assertEquals("Đỗ toán", result);
    }

    @Test
    public void test2() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("Toán", 41, 8);
        assertEquals("Trượt", result);
    }

    @Test
    public void test3() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("Tin", 41, 8);
        assertEquals("Đỗ tin", result);
    }

    @Test
    public void test4() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("Tin", 40, 8);
        assertEquals("Trượt", result);
    }

    @Test
    public void test5() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("", 42, 8.5);
        assertEquals("Đỗ toán", result);
    }

    @Test
    public void test6() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("", 41, 8.5);
        assertEquals("Đỗ tin", result);
    }

    @Test
    public void test7() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("", 42, 7);
        assertEquals("Trượt", result);
    }
    @Test
    public void test8() {
        checkScoreStudent checker = new checkScoreStudent();
        String result = checker.check("", 41.5, 8.5);
        assertEquals("Đỗ tin", result);
    }
}
