import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {

    @Test
    public void testSum(){
        Calculator caculator = new Calculator();
        Assert.assertEquals(caculator.sum(2, 3), 5);
    }

    @Test
    public void testSub(){
        Calculator caculator = new Calculator();
        Assert.assertEquals(caculator.sub(5, 2), 3);
    }
}
