package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class racingCar {

    private racingcarName carName;
    private racingcarMoveCount carMoveCount;
    private racingcarPosition position;

    public racingCar(racingcarName carName, racingcarMoveCount carMoveCount, racingcarPosition position) {
        this.carName = carName;
        this.carMoveCount = carMoveCount;
        this.position = position;
    }
    public racingcarName getCarName() {
        return carName;
    }

    public racingcarMoveCount getCarMoveCount() {
        return carMoveCount;
    }

    public racingcarPosition getPosition() {
        return position;
    }

    public void move(racingCar carMove) {
        carMove.position = new racingcarPosition(carMove.getPosition().getPosition()+1);
    }

    public void stop(racingCar carMove) {
        carMove.position = new racingcarPosition(carMove.getPosition().getPosition());
    }
}
