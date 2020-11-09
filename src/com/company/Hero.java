package com.company;

public abstract class Hero implements HavingSuperAbility{
        int health;
        int damage;
        String superAbilityType;
        Hero(int Health, int damage, String superAbilityType ){
            this.health = health;
            this.damage = damage;
            this.superAbilityType = superAbilityType;
        }


}
