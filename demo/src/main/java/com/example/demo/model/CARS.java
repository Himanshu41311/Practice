package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Cars")
public class CARS {
    @Id
    private String ID;
    private String name;
    private String model;
    private String type;
    private String description;
    private LocalDate date;

    // Constructor to initialize with values and set the current date
    public CARS(String ID, String name, String model, String type,String desc) {
        this.ID = ID;
        this.name = name;
        this.model = model;
        this.type = type;
        this.description = desc;
        this.date = LocalDate.now(); // Assign current date
    }

    // Default constructor with current date assignment
    public CARS() {
        this.date = LocalDate.now(); // Assign current date
    }

    // Getters and setters
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

}
