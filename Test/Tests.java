import com.sun.tools.javac.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
   public void check1() {

        int a1[] = {1, 5, 2, 8, -4, 0};
        assertEquals(List.of(16, 1, 3), Choice.choose(a1));

        int a2[] = {-1, -3, -8, -4};
        assertEquals(List.of(-1, 0, 0), Choice.choose(a2));


    }

}

