package com.dependence.inversion.principle;

import com.dependence.inversion.principle.service.ICar;

public class BMW implements ICar {

    @Override
    public void run(){
        System.out.print("BMWDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
    }
}
