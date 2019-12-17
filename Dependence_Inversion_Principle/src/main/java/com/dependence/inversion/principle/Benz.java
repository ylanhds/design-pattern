package com.dependence.inversion.principle;

import com.dependence.inversion.principle.service.ICar;

public class Benz implements ICar {


    @Override
    public void run() {
        System.out.print("BENZDDDDDDDDDDDDDDDDDDDD");
    }
}
