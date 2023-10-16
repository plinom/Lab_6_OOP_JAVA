package maxondev.flowerStore.flowers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    RED("red"), GREEN("green"), BLUE("blue");
    private String lable;
    FlowerColor(String label) {
        this.lable = label;
    }
    public String toString() {
        return lable;
    }
    @JsonValue
    public String getValue() {
        return RED.lable;
    }
}
