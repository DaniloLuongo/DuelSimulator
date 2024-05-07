package dev.dany.duelsimulator.items;

import java.io.Serializable;

public class Potion extends Item implements Serializable
{
    private int value;
    private boolean harmful;
    
    public Potion(String name, int value, boolean harmful)
    {
        super(name);
        this.value = value;
        this.harmful = harmful;
    }

    @Override
    public int use()
    {
        if(harmful)
            return -value;
        else
            return value;
    }
    
    //Metodi Get e Set

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isHarmful() {
        return harmful;
    }

    public void setHarmful(boolean harmful) {
        this.harmful = harmful;
    }
}
