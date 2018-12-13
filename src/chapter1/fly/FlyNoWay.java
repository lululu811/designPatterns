package chapter1.fly;

/**
 * @author cl 18222901084@163.com
 * @version V1.0
 * @Title: FlyNoWay
 * @Package chapter1.fly
 * @Description: TODO
 * @date 2018/12/13 23:05
 **/

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是一个不会飞的鸭子");
    }
}
