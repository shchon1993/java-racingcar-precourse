package racingcar.model;

public class racingcarName {
    private final String carName;

    public racingcarName(String carName) {
        validationcheckNameLength(carName);
        this.carName = carName;
    }
    private void validationcheckNameLength(String carName) {
        if(carName.length() == 0)
            throw new IllegalArgumentException("자동차 이름을 입력하지 않았습니다.");
        if(carName.length()>5)
            throw new IllegalArgumentException("자동차 이름의 길이가 5를 넘었습니다.");
    }
    public String getCarName() {
        return carName;
    }
}
