package racingcar.model;

public class racingCar {


    private racingcarName carName;
    private racingcarPosition position;
    public racingCar(racingcarName carName,  racingcarPosition position) {
        this.carName = carName;
        this.position = position;
    }

    public racingcarName getCarNameClass() {
        return carName;
    }

    public racingcarPosition getPositionClass() {
        return position;
    }


}
