package com.company;

public class Warrior extends Hero {
    Warrior(int Health, int damage, String superAbilityType) {
        super(Health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность " + superAbilityType);

    }
}
