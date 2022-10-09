package racingcar.model;

import racingcar.utils.exceptionMessage;

public class racingcarPosition {
    private exceptionMessage message = new exceptionMessage();



    private int position;
    private final String Move_position = "-";
    private final int moveCount = 1;
    public racingcarPosition(int position) {
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

    /* public racingcarPosition move(){
        System.out.println("move(): " + (position + moveCount));
        return new racingcarPosition((position + moveCount));
    }

    */
    public void setPosition(int position) {
        this.position = position;
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
