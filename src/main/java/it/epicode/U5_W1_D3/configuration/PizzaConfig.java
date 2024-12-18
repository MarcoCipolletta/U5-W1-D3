package it.epicode.U5_W1_D3.configuration;


import it.epicode.U5_W1_D3.entities.Pizza;
import it.epicode.U5_W1_D3.entities.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class PizzaConfig {
    @Autowired
    private Topping toppings_tomato;
    @Autowired
    private  Topping toppings_cheese;

    @Bean
    @Scope("prototype")
    public Pizza margherita(){
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.getToppingList().add(toppings_tomato);
        pizza.getToppingList().add(toppings_cheese);
        pizza.setCalories();
        pizza.setPrice();

        toppings_cheese.getPizzas().add(pizza);
        toppings_tomato.getPizzas().add(pizza);
        return pizza;
    }
}
