import org.junit.jupiter.api.Test;
import unisheld.PrimeDecomp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeDecompTest {
    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimeDecomp.factors(lst));
    }
}
