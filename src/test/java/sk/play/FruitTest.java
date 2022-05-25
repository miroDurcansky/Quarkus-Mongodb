package sk.play;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class FruitTest {

    @Inject
    FruitService fruitService;

    @Ignore
    @Test
    void addFruitInMongoDB(){
        Fruit fruit = new Fruit();
        fruit.setName("mango");
        fruit.setDescription("mango is cool");

        fruitService.add(fruit);
    }
}
