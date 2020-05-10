package TestUniut.Assert_Assume;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest {
    @Test
    public void assumeTrueTest() {
        Assume.assumeTrue(5>3);
        System.out.println("execute test");
    }

    @Test
    public void assumeNotNullTest() {
        Object object = null;
        Assume.assumeNotNull(object);
        System.out.println("execute test");
    }
}
