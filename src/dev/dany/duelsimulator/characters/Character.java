package dev.dany.duelsimulator.characters;

import dev.dany.duelsimulator.items.*;
import java.io.Serializable;

public class Character implements Serializable
{
    private int hp;
    private int maxHp;
    private String name;
    private Potion[] inventory;
    private Armor armor;
    private Weapon sxHand;
    private Weapon dxHand;
    private float strength;
    private int speed;
    
    public Character(String name, int hp, Armor armor, Weapon sxHand, Weapon dxHand, float strength, int speed)
    {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.inventory = new Potion[5];
        this.armor = armor;
        this.sxHand = sxHand;
        this.dxHand = dxHand;
        this.strength = strength;
        this.speed = speed;
        
        for(int i = 0; i < 5; i++)
        {
            if(i <= 2)
                inventory[i] = new Potion("Heal", 20, false);
            else
                inventory[i] = new Potion("Molotov", 40, true);
        }
    }
    
    public boolean attack(Character target, Weapon weapon)
    {
        int damage = weapon.use();
        damage *= strength;
        System.out.println(this.name + " attacked " + target.getName() + " with a " + weapon.getName());
        return target.takeDamage(damage);
    }
    
    public boolean takeDamage(int damage)
    {
        int realDamage = Math.max(0, (damage - armor.getDefence() - sxHand.getArmorBonus() - dxHand.getArmorBonus() - speed));
        hp -= realDamage;
        System.out.println(this.name + " took " + realDamage + " damage!");
        System.out.println();
        if(hp <= 0)
            return true;
        else
            return false;
    }
    
    public void reset()
    {
        hp = maxHp;
        
        for(int i = 0; i < 5; i++)
        {
            if(i <= 2)
                inventory[i] = new Potion("Heal", 15, false);
            else
                inventory[i] = new Potion("Poison", 10, true);
        }
    }
    
    //Metodi Get e Set

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Potion[] getInventory() {
        return inventory;
    }

    public void setInventory(Potion[] inventory) {
        this.inventory = inventory;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getSxHand() {
        return sxHand;
    }

    public void setSxHand(Weapon sxHand) {
        this.sxHand = sxHand;
    }

    public Weapon getDxHand() {
        return dxHand;
    }

    public void setDxHand(Weapon dxHand) {
        this.dxHand = dxHand;
    }
}