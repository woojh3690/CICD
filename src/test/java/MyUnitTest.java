import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class MyUnitTest {
    private final MyUnit unit = new MyUnit();

    @Test
    @DisplayName("문자열 합치기 테스트")
    void concat() {
        assertEquals(
                "first second",
                unit.concatenate("first", "second")
        );
    }
}
