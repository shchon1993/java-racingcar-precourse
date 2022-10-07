package racingcar.model;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class racingCarTest {
    @Test
    void 자동차_1대_출발선_테스트(){
        racingCar car = new racingCar(new racingcarName("pobi"),new racingcarMoveCount("5"), new racingcarPosition(0), new racingCarCurrentResult(""));
        assertThat(car.getCarName().getCarName()).isEqualTo("pobi");
        assertThat(car.getCarMoveCount().getMoveCount()).isEqualTo("5");
        assertThat(car.getPosition().getPosition()).isEqualTo(0);

    }

    @Test
    void 자동차_1대_전진_테스트(){
        racingCar car = new racingCar(new racingcarName("pobi"),new racingcarMoveCount("5"), new racingcarPosition(2), new racingCarCurrentResult(""));
        car.move(car);
        assertThat(car.getCarName().getCarName()).isEqualTo("pobi");
        assertThat(car.getCarMoveCount().getMoveCount()).isEqualTo("5");
        assertThat(car.getPosition().getPosition()).isEqualTo(3);

    }
    @Test
    void 자동차_1대_멈춤_테스트(){
        racingCar car = new racingCar(new racingcarName("pobi"),new racingcarMoveCount("5"), new racingcarPosition(2), new racingCarCurrentResult(""));
        car.stop(car);
        assertThat(car.getCarName().getCarName()).isEqualTo("pobi");
        assertThat(car.getCarMoveCount().getMoveCount()).isEqualTo("5");
        assertThat(car.getPosition().getPosition()).isEqualTo(2);

    }

    @Test
    void 자동차_1대_이동후_출력결과_테스트(){
        racingCar car = new racingCar(new racingcarName("pobi"),new racingcarMoveCount("5"), new racingcarPosition(0), new racingCarCurrentResult(""));
        car.move(car);
        car.stop(car);
        car.move(car);
        car.move(car);
        assertThat(car.getCurrentResult().getCurrentResult()).isEqualTo("- --");
    }

}
