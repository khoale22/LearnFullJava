package TestUniut.Assert_Assume;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;


import static org.hamcrest.core.Is.is;


public class AssertTest {
    @Test
    public void testAssertEquals() {
        Assert.assertEquals("failure - strings are not equal", "text", "text");
    }

    @Test
    public void testAssertArrayEquals() {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        Assert.assertArrayEquals("failure - two arrays not same", arr1, arr2);
        Assert.assertArrayEquals( arr1, arr2);
    }

    @Test
    public void testAssertTrue() {
        Assert.assertTrue("failure - should be true", true);
        Assert.assertTrue( true);
        Assert.assertTrue(5>3);
    }

    @Test
    public void testAssertFalse() {
        Assert.assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNull() {
        Assert.assertNull("should be null", null);
    }

    @Test
    public void testAssertNotNull() {
        Assert.assertNotNull("should not be null", new Object());
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(768);
        Assert.assertSame("should be same", aNumber, aNumber); // check tham chiếu có the same hay không
    }

    @Test
    public void testAssertSame3() {
       String a = new String("khoa");
        String b = new String("khoa");
        Assert.assertSame("Falied : should be same", a, b); // failed vì 2 đối tượng tham chiều khác nhau
    }

    @Test
    public void testAssertNotSame() {
        Assert.assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testFail() throws Exception {
        Assert.fail("Make fails a test"); // luon luon fail
    }
    @Test
    public void testAssertThatObject() {
        Assert.assertThat("123",is(String.class));
    }

    @Test
    public void testAssertThatWMessage(){
        Assert.assertThat("They are not equal!","123",is("1234"));
    }
    @Test
    public void testAssertThatWMessage33(){
        Assert.assertThat("123",is("1234"));
    }
    @Test
    public void testAssertThatWMessage44(){
      

    }
}
