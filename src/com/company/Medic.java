package com.company;

public class Medic extends Hero {

    Medic(int Health, int damage, String superAbilityType) {
        super(Health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Медик применил суперспособность " + superAbilityType);

    }
}
