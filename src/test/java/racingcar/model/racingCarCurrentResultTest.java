package racingcar.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class racingCarCurrentResultTest {
    @Test
    void 자동차_1대_전진_멈춤_출력결과_테스트(){
        racingCarCurrentResult result = new racingCarCurrentResult("- --");
        assertThat(result.getCurrentResult()).isEqualTo("- --");

    }
}
