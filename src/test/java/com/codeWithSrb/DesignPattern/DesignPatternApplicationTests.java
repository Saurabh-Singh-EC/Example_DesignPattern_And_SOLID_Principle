package com.codeWithSrb.DesignPattern;

import com.codeWithSrb.DesignPattern.abstractFactoryPattern.FurnitureShop;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void testAbstractFactoryDesignPattern() {
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.buyFurniture("Modern");
    }

}
