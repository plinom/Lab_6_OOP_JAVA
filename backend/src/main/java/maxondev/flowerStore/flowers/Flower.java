package maxondev.flowerStore.flowers;

import lombok.Setter;
import lombok.Getter;

@Getter @Setter
public class Flower {
    private FlowerColor color;
    private double price;
    private double sepalLength;

    public Flower(FlowerColor color, int price, double sepalLength) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
}
