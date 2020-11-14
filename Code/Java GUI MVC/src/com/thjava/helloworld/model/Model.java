package com.thjava.helloworld.model;

public class Model {
    
    // ประกาศตัวแปร
    private String name;    
    
    // Getter & Setter  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // toString() 

    @Override
    public String toString() {
        return "Model{" + "name=" + name + '}';
    }
    
 
} // class Model
