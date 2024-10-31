package ir.selab.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthenticationServiceTest {
    @Test
    public void userCreationTest() {
        User ali = new User("ali", "1234");
        assertEquals("ali", ali.getUsername());
    }
}
