package dev.dany.duelsimulator.items;

import java.io.Serializable;

public class Armor extends Item implements Serializable
{
    private int defence;
    
    public Armor(String name, int defence)
    {
        super(name);
        this.defence = defence;
    }
    
    @Override
    public int use()
    {
        return 0;
    }
    
    //Metodi Get e Set

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}