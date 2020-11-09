package com.company;

public class Main {

    public static void main(String[] args) {
    Hero[] heroes = { new Magic(100, 5, "Заморозка"), new Medic(50, 1,
            "CRITICAL HEAL"), new Warrior(150,25,"CRITICAL DAMAGE")};
    String[] superAbility = {"Заморозка", "CRITICAL HEAL", "CRITICAL DAMAGE"};
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].applySuperAbility(superAbility[i]);

        }

    }
}
