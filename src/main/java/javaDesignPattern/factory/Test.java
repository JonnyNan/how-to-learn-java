package javaDesignPattern.factory;

import javafx.scene.chart.CategoryAxis;

/**
 * @description: 工厂设计模式
 * @author: JonnyNan
 * @create: 2018-12-07 15:20
 **/

interface Car {

    void run();
}

class Audi implements Car {
    @Override
    public void run() {
        System.out.println("我是奥迪汽车-我是奥迪A6l");
    }
}

class Baoma implements Car {
    @Override
    public void run() {
        System.out.println("我是宝马汽车，宝马m4");
    }
}

class CarFactory {
    public static Car createCar(String carName) {
        Car car = null;
        switch (carName) {
            case "奥迪":
                car = new Audi();
                break;
            case "宝马":
                car = new Baoma();
                break;
            default:
                break;
        }
        return car;
    }
}

//工厂方法就是简单工厂分开，奥迪和宝马分别对应两个工厂

public class Test {
    public static void main(String[] args) {
//        Car car = CarFactory.createCar("奥迪");
        Car car = CarFactory.createCar("宝马");
        //简单工厂设计模式-任何一个创建对象，不是有调用者创建的，是工厂帮你创建的。
        car.run();
    }
}
