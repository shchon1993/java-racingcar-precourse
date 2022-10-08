package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class racingCarsTest {
    @Test
    void 자동차_여러대_사이즈_테스트(){
        racingCars cars = new racingCars(Arrays.asList(new racingCar(new racingcarName("pobi"),new racingcarPosition(0)),new racingCar(new racingcarName("qwer"),new racingcarPosition(1))));
        assertThat(cars.getCars().size()).isEqualTo(2);
    }

    @Test
    void 자동차_여러대_길이_제한_5이상() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->
                new racingCars(Arrays.asList(new racingCar(new racingcarName("pobiiii"),new racingcarPosition(0)),new racingCar(new racingcarName("qwerrrrr"),new racingcarPosition(1)))));
        assertEquals("[ERROR] 자동차 이름의 길이가 5를 넘었습니다.", e.getMessage());
    }

    @Test
    void 자동차이름_여러대_길이_제한_0이하() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->
                new racingCars(Arrays.asList(new racingCar(new racingcarName("pobi"),new racingcarPosition(0)),new racingCar(new racingcarName(""),new racingcarPosition(1)))));
        assertEquals("[ERROR] 자동차 이름을 입력하지 않았습니다.", e.getMessage());
    }

    @Test
    void 자동차_여러대_포지션_값_음수() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->
                new racingCars(Arrays.asList(new racingCar(new racingcarName("pobi"),new racingcarPosition(-1)),new racingCar(new racingcarName("asds"),new racingcarPosition(2)))));
        assertEquals("[ERROR] 입력하신 숫자가 음수입니다.", e.getMessage());
    }

}
