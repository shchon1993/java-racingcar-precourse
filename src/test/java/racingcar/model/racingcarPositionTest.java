package racingcar.model;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class racingcarPositionTest {
    @Test
    void 레이싱카_출발선_포지션_테스트(){
        racingcarPosition position = new racingcarPosition(0);
        assertThat(position.getPosition()).isEqualTo(0);
    }

    @Test
    void 레이싱카_움직인후_포지션_테스트(){
        racingcarPosition position = new racingcarPosition(3);
        assertThat(position.getPosition()).isEqualTo(3);
    }

}
