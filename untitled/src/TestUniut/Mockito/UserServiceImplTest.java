package TestUniut.Mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the mock data
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    // Create a mock object
    @Mock
    private UserDao userDao;

    private UserDao userDao4;

//    @Mock
    private UserService userService;

    // Create a mock object to inject dependency (UserDao)
//    @InjectMocks
//    private UserService userService444;

    @Before
    public void setUp() {
        System.out.println("------RUUN----------");
        userService = new UserServiceImpl(userDao);
    }

    @Test
    public void createUser_WhenEmailExisted_ReturnFailed() {
        // Define return value for method createUser()
        Mockito.when(userDao.createUser("existed@gpcoder.com")).thenReturn(false);

        // Use mock in test
        Assert.assertEquals("FAILED", userService.createUser("existed@gpcoder.com"));
    }

    @Test
    public void createUser_WhenEmailNotExisted_ReturnSuccess() {
        // Define return value for method createUser()
        Mockito.when(userDao.createUser("not_existed@gpcoder.com")).thenReturn(true);

        // Use mock in test
        Assert.assertEquals("SUCCESS", userService.createUser("not_existed@gpcoder.com"));
    }
}
