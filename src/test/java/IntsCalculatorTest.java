import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntsCalculatorTest {
    Ints sut = new IntsCalculator();

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running IntsCalculatorTest");
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("IntsCalculatorTest complete");
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Test start");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete");
    }

    @Test
    public void sumTest() {
        //given
        int original = 15;

        //when
        int result = sut.sum(7 , 8);

        //then
        assertEquals(original, result);
    }

    @Test
    public void multTest() {
        //given
        int original = 56;

        //when
        int result = sut.mult(7 , 8);

        //then
        assertEquals(original, result);
    }

    @Test
    public void powTest() {
        //given
        int original = 9;

        //when
        int result = sut.pow(3 , 2);

        //then
        assertEquals(original, result);
    }
}
