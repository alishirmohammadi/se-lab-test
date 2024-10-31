package ir.selab.tdd;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AuthenticationServiceTest {
    @Test
    public void userCreationTest() {
        User ali = new User("ali", "1234");
        assertEquals(ali.getUsername(), "ali");
    }
}
