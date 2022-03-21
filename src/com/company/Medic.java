package com.company;

public class Medic extends Hero {
    private int healPoints;
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic применил суперспособность HEALING");
    }
}
