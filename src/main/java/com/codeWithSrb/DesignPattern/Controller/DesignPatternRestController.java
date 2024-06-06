package com.codeWithSrb.DesignPattern.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DesignPatternRestController {


    /**

    private SingletonPattern singletonPattern;

    public DesignPatternRestController(SingletonPattern singletonPattern) {
        System.out.println("Design pattern rest controller constructor called");
        this.singletonPattern = singletonPattern;
    }

    @GetMapping("/singleton")
    public String getSingleton() {
        return "This is singleton instance " + singletonPattern.getInstance().getClass();
    }

    */

    /**
    @GetMapping(value = "/paymentprocessor/{paymentMethod}")
    public void processPaymentWithProcessor(@PathVariable (value = "paymentMethod") String paymentMethod) {
        var paymentProcessor = PaymentProcessorFactory.createPaymentProcessor(paymentMethod);
        var paymentType = paymentProcessor.createPaymentType();
        paymentType.pay();
    }
    */

    /**
    @GetMapping("/builder")
    public void builderPattern() {
        Employee employee = Employee.newBuilder(1).withName("Rock").build();
        System.out.println(employee.toString());
    }
    */

    /**
    @GetMapping("/getShops")
    public void prototypePattern() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("BookShop1");
        bookShop.loadBooks();

        System.out.println(bookShop);

        BookShop anotherBookShop = bookShop.clone();
        bookShop.getBooks().remove(2);
        anotherBookShop.setShopName("BookShop2");

        System.out.println(anotherBookShop);
        System.out.println(bookShop);
    }
    */

    /**
    @GetMapping("/state")
    public void behaviouralStatePattern() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new Selection());

        canvas.mouseUp();
        canvas.mouseDown();
    }
    */
}