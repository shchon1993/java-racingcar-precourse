package racingcar.model;

public class racingcarPosition {

    private final int position;
    private static StringBuilder builder;
    private final String Move_position = "-";
    public racingcarPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String toPrintResult() {
        if(position == 0)
            return "";
        builder = new StringBuilder();
        builder.append(Move_position);
        return builder.toString();
    }
}
