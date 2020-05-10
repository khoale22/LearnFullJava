package TestUniut.MokitoSpy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
    public class SpyAnnotationTest {

      //  @Spy
        @Mock
        private List<String> spyList = new ArrayList<>();

        @Test
        public void test() {
            // Using mock object
            spyList.add("gpcoder.com");  // đả gọi hàm add nhung ko chỉ giả lập

            // Verifies certain behavior
            Mockito.verify(spyList).add("gpcoder.com"); // kiểm tra đả gọi hàm add chưa

            // Method add() is really called,
            // it run on real object, so the size is 1
            Assert.assertEquals(1, spyList.size());  // NOt ok wih mock
            Assert.assertEquals("gpcoder.com", spyList.get(0));

            // We can assign the size of spy object
            Mockito.when(spyList.size()).thenReturn(5);   //OK with mock
            Assert.assertEquals(5, spyList.size());
        }

        @Test
        public void test22() {
            // Using mock object
            spyList.add("gpcoder.com");

            // Verifies certain behavior
            Mockito.verify(spyList).add("gpcoder.com");
        }

    }
