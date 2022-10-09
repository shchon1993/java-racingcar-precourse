package racingcar.model;

public class racingCar {


    private racingcarName carName;

    private racingcarPosition position;

    public racingCar(racingcarName carName, racingcarPosition position) {
        this.carName = carName;
        this.position = position;
    }

    public racingcarName getCarNameClass() {
        return carName;
    }
    public void setCarNameClass(racingcarName carName) {
        this.carName = carName;
    }
    public racingcarPosition getPositionClass() {
        return position;
    }
    public void setPositionClass(racingcarPosition position) {
        this.position = position;
    }


}
