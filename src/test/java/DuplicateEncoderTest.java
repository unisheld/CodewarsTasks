import org.junit.jupiter.api.Test;
import unisheld.DuplicateEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
