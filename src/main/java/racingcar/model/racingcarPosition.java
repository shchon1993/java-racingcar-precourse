package racingcar.model;

import racingcar.utils.exceptionMessage;

public class racingcarPosition {
    private exceptionMessage message = new exceptionMessage();


    private final int position;
    private final String Move_position = "-";
    private final int moveCount = 1;
    public racingcarPosition(final int position) {
        validationcheckPositionNegative(position);
        this.position = position;
    }

    public void validationcheckPositionNegative(int position){
        if(position < 0)
            throw new IllegalArgumentException(message.InputNumNegative());
    }

    public int getPosition() {
        return position;
    }

    public racingcarPosition move(){
        return new racingcarPosition(position + moveCount);
    }

    @Override
    public String toString() {
        if(position == 0) return "";
        String result = "";
        for(int i=0; i<position; i++){
            result += Move_position;
        }
        return result;
    }

}
