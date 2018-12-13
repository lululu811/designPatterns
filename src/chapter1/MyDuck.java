package chapter1;

import chapter1.fly.FlyWithWing;
import chapter1.quack.Quack;

/**
 * @author cl 18222901084@163.com
 * @version V1.0
 * @Title: MyDucket
 * @Package chapter1
 * @Description: TODO
 * @date 2018/12/13 23:11
 **/

public class MyDuck extends Duck {
    public MyDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void swim() {
        System.out.println("我是一个回游泳的鸭子");
    }
}
