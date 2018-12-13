package chapter1.fly;

/**
 * @author cl 18222901084@163.com
 * @version V1.0
 * @Title: FlyWithWing
 * @Package chapter1
 * @Description: TODO
 * @date 2018/12/13 23:04
 **/

public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是一个会飞的鸭子");
    }
}
