package flyweight.pattern.core28_8;

import flyweight.pattern.core28_7.Flyweight;

public class ConcreteFlyweight2 extends Flyweight {

    //接受外部状态
    public ConcreteFlyweight2(String _Extrinsic) {
        super(_Extrinsic);
    }

    //根据外部状态进行逻辑处理
    @Override
    public void operate() {
        //业务逻辑
    }
}
