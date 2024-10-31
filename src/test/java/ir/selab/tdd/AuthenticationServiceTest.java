package ir.selab.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AuthenticationServiceTest {
    @Test
    public void userCreationTest() {
        User ali = new User("ali", "1234");
        assertEquals("ali", ali.getUsername());
    }

    @Test
    public void userServiceAuthenticationTest() {
        UserService userService = new UserService();
        assertFalse(userService.authenticate("1", "2"));
    }
}
