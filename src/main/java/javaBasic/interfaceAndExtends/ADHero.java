package javaBasic.interfaceAndExtends;

import javaBasic.classAndObject.Hero;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
