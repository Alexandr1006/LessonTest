import me.popov.lessontest1.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserTest {
    private static User user1;
    private static User user2;

    @BeforeAll
    public static void creatUsers() {
        user1 = new User();
        user2 = new User("test2", "test@mail.ru");
    }

    @Test
    public void testCreateUserWithParameters() {
        assertTrue(user2.getEmail() != null && user2.getLogin() != null);
    }

    @Test
    public void testCreateUserWithoutParameters() {
        assertTrue(user1.getEmail() == null && user1.getLogin() == null);
    }
}