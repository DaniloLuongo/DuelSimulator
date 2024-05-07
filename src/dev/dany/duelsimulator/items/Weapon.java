package dev.dany.duelsimulator.items;

import java.io.Serializable;

public class Weapon extends Item implements Serializable
{
    private int min, max;
    private int armorBonus;
    private int speed;
    
    public Weapon(String name, int min, int max, int armorBonus, int speed)
    {
        super(name);
        this.min = min;
        this.max = max;
        this.armorBonus = armorBonus;
        this.speed = speed;
    }
    
    @Override
    public int use()
    {
        return (int) Math.min((min + (Math.random() * max)), max);
    }
    
    //Metodi Get e Set

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getArmorBonus() {
        return armorBonus;
    }
    
    public int getSpeed(){
        return speed;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setArmorBonus(int armorBonus) {
        this.armorBonus = armorBonus;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
}