package racingcar.utils;

public class exceptionMessage {
    public String inputOnlyNumber(){
        return "[ERROR] 숫자만 입력해 주세요";
    }

    public String noInputCarName(){
        return "[ERROR] 자동차 이름을 입력하지 않았습니다.";
    }

    public String InputCarName5Over(){
        return "[ERROR] 자동차 이름의 길이가 5를 넘었습니다.";
    }
    public String InputNumNegative(){
        return "[ERROR] 입력하신 숫자가 음수입니다.";
    }

}
