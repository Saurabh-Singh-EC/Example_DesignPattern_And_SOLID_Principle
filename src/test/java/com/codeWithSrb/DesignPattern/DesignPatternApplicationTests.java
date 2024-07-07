package com.codeWithSrb.DesignPattern;

import com.codeWithSrb.DesignPattern.Singleton.*;
import com.codeWithSrb.DesignPattern.abstractFactoryPattern.FurnitureShop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void testAbstractFactoryDesignPattern() {
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.buyFurniture("Modern");
    }

    @Test
    void testLazyInitializedSingletonPattern() {
        LazyInitializedSingletonPattern instance1 = LazyInitializedSingletonPattern.getInstance();
        Assertions.assertNotNull(instance1);

        LazyInitializedSingletonPattern instance2 = LazyInitializedSingletonPattern.getInstance();
        Assertions.assertNotNull(instance2);

        Assertions.assertEquals(instance1, instance2);

    }

    @Test
    void testEagerInitializedSingletonPattern() {
        EagerInitializedSingletonPattern instance1 = EagerInitializedSingletonPattern.getInstance();
        Assertions.assertNotNull(instance1);

        EagerInitializedSingletonPattern instance2 = EagerInitializedSingletonPattern.getInstance();
        Assertions.assertNotNull(instance2);

        Assertions.assertEquals(instance1, instance2);

    }

    @Test
    void testStaticBlockInitializedSingletonPattern() {
        StaticBlockSingletonPattern instance1 = StaticBlockSingletonPattern.getInstance();
        Assertions.assertNotNull(instance1);

        StaticBlockSingletonPattern instance2 = StaticBlockSingletonPattern.getInstance();
        Assertions.assertNotNull(instance2);

        Assertions.assertEquals(instance1, instance2);

    }

    @Test
    void testThreadSafeSingletonPattern() {
        ThreadSafeSingletonPattern instance1 = ThreadSafeSingletonPattern.getInstance();
        Assertions.assertNotNull(instance1);

        ThreadSafeSingletonPattern instance2 = ThreadSafeSingletonPattern.getInstance();
        Assertions.assertNotNull(instance2);

        Assertions.assertEquals(instance1, instance2);

    }

    @Test
    void testBillPughSingletonPattern() {
        BillPughSingletonPattern instance1 = BillPughSingletonPattern.getInstance();
        Assertions.assertNotNull(instance1);

        BillPughSingletonPattern instance2 = BillPughSingletonPattern.getInstance();
        Assertions.assertNotNull(instance2);

        Assertions.assertEquals(instance1, instance2);

    }

}
