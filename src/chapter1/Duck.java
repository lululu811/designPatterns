package chapter1;

import chapter1.fly.FlyBehavior;
import chapter1.quack.QuackBehavior;

/**
 * @author cl 18222901084@163.com
 * @version V1.0
 * @Title: ducket
 * @Package Chapter1
 * @Description: TODO
 * @date 2018/12/13 22:57
 **/

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
