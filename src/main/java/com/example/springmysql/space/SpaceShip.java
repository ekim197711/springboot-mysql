package com.example.springmysql.space;

import javax.persistence.*;

@Entity
@Table
public class SpaceShip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String captain;
    private int fuel;

    public SpaceShip(String captain, int fuel) {
        this();
        this.id = null;
        this.captain = captain;
        this.fuel = fuel;
    }

    public SpaceShip() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
