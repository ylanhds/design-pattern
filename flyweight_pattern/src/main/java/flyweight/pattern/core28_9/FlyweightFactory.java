package flyweight.pattern.core28_9;

import flyweight.pattern.core28_7.Flyweight;
import flyweight.pattern.core28_8.ConcreteFlyweight1;
import java.util.HashMap;

public class FlyweightFactory {

    //定义一个容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    //享元工厂
    public static Flyweight getFlyweight(String Extrinsic) {
        //需要返回的对象
        Flyweight flyweight;
        //在池中没有改对象
        if (pool.containsKey(Extrinsic)) {
            flyweight = pool.get(Extrinsic);
        } else {
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight1(Extrinsic);
            //放置到池中
            pool.put(Extrinsic, flyweight);
        }
        return flyweight;
    }
    //

}
