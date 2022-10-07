package racingcar.model;

public class racingCar {

    private racingcarName carName;
    private racingcarMoveCount carMoveCount;
    private racingcarPosition position;
    private racingCarCurrentResult currentResult;
    private final String movePosition = "-";
    private final String StopPosition = " ";
    private final int moveCount = 1;

    public racingCar(racingcarName carName, racingcarMoveCount carMoveCount, racingcarPosition position, racingCarCurrentResult currentResult) {
        this.carName = carName;
        this.carMoveCount = carMoveCount;
        this.position = position;
        this.currentResult = currentResult;
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
    public racingCarCurrentResult getCurrentResult() {
        return currentResult;
    }


    public void move(racingCar carMove) {
        carMove.position = new racingcarPosition(carMove.getPosition().getPosition()+moveCount);
        carMove.currentResult = new racingCarCurrentResult(carMove.getCurrentResult().getCurrentResult()+movePosition);
    }

    public void stop(racingCar carMove) {
        carMove.position = new racingcarPosition(carMove.getPosition().getPosition());
        carMove.currentResult = new racingCarCurrentResult(carMove.getCurrentResult().getCurrentResult()+StopPosition);
    }


}
