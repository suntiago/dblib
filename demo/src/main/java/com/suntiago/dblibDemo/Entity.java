package com.suntiago.dblibDemo;

import org.kymjs.kjframe.database.annotate.Property;
import org.kymjs.kjframe.database.annotate.Table;

/**
 * Created by zy on 2018/11/16.
 */

@Table(name = "example_table")
public class Entity {

    public Entity() {
    }

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Property(column = "id")
    private int id;
    @Property(column = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
