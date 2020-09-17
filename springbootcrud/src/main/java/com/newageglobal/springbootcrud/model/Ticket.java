package com.newageglobal.springbootcrud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
 //   @GeneratedValue

    private int id;
    private double amount;
    private String category;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }
}
