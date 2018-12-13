package chapter1.quack;

/**
 * @author cl 18222901084@163.com
 * @version V1.0
 * @Title: Squeak
 * @Package chapter1.quack
 * @Description: TODO
 * @date 2018/12/13 23:07
 **/

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是一个嘎嘎叫的鸭子");
    }
}
