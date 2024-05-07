package dev.dany.duelsimulator.items;

import java.io.Serializable;

public abstract class Item implements Serializable
{
    protected String name;
    
    public Item(String name)
    {
        this.name = name;
    }
    
    public abstract int use();
    
    //Metodi Get e Set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}