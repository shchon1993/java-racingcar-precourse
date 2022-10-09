package racingcar.model;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class racingCarTest {

    @Test
    void 자동차_1대_출발선_테스트(){
        racingCar car = new racingCar(new racingcarName("pobi"), new racingcarPosition(0));
        assertThat(car.getCarNameClass().getCarName()).isEqualTo("pobi");
        assertThat(car.getPositionClass().getPosition()).isEqualTo(0);

    }
    /*
    @Test
    void 자동차_1대_전진_테스트(){
        racingCar car = new racingCar(new racingcarName("pobi"), new racingcarPosition(2));
        assertThat(car.getPositionClass().move()).hasToString("---");

    }
     */
}
