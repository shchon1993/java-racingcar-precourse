package racingcar.model;

public class racingcarMoveCount {

    private final String moveCount;

    public racingcarMoveCount(String moveCount) {
        checkNumeicMoveCount(moveCount);
        this.moveCount = moveCount;
    }
    public boolean isNumeric(String strMoveCount){
        try {
            Integer.parseInt(strMoveCount);
            return true;
        }catch(IllegalArgumentException e){
            return false;
        }
    }
    public void checkNumeicMoveCount(String strMoveCount){
        if(!isNumeric(strMoveCount))
            throw new IllegalArgumentException("숫자만 입력해 주세요");
    }

    public String getMoveCount() {
        return moveCount;
    }
}
