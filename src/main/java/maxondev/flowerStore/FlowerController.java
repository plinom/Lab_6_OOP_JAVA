package maxondev.flowerStore;

import maxondev.flowerStore.flowers.Flower;
import maxondev.flowerStore.flowers.FlowerColor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    @RequestMapping("/list/")
    public List<Flower> home() {
        return List.of(new Flower(FlowerColor.RED, 12, 3.1));
    }
}
