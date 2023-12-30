import org.example.SumCalculator;
import org.junit.jupiter.api.*;


class SumCalculatorTest {
    @BeforeEach
    public void start(){
        System.out.println("Test is being executed.");
    }

    @Test
    void sum1Test() throws Exception{
        SumCalculator sum = new SumCalculator();
        int result = sum.sum(1);

        Assertions.assertEquals(1, result);
    }

    @Test
    void sum3Test() throws Exception{
        SumCalculator sum = new SumCalculator();
        int result = sum.sum(3);

        Assertions.assertEquals(6, result);
    }

    @Test
    void sum0Test() throws Exception{
        SumCalculator sum = new SumCalculator();

        Assertions.assertThrows(IllegalArgumentException.class, () -> sum.sum(0));
    }

    @AfterEach
    public void finish(){
        System.out.println("Test execution completed.");
    }
}
