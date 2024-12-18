package it.epicode.U5_W1_D3.entities;


import it.epicode.U5_W1_D3.interfacces.IMenuItem;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "foodsanddrinks")
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class FoodAndDrink implements IMenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private long id;

    private String name;
    private double price;
    private int calories;
}
