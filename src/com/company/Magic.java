package com.company;

public class Magic extends Hero {


    Magic(int Health, int damage, String superAbilityType) {
        super(Health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic применил суперспособность " + superAbilityType);

    }
}
