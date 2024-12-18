package it.epicode.U5_W1_D3.runner;


import it.epicode.U5_W1_D3.entities.Pizza;
import it.epicode.U5_W1_D3.entities.Topping;
import it.epicode.U5_W1_D3.repo.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
//@RequiredArgsConstructor
@Order(1)
public class PizzaAndToppingRunner implements ApplicationRunner {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private  Topping toppings_ham;
    @Autowired
    private  Topping toppings_pineapple;
    @Autowired
    private  Topping toppings_salami;
    @Autowired
    private  PizzaRepository pizzarepo;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("------ Salvataggio pizze e topping ------");
        Pizza margherita = context.getBean("margherita", Pizza.class);
        pizzarepo.save(margherita);


        Pizza hawaian = context.getBean("margherita", Pizza.class);
        hawaian.setName("Hawaian");
        hawaian.getToppingList().add(toppings_ham);
        hawaian.getToppingList().add(toppings_pineapple);
        toppings_ham.getPizzas().add(hawaian);
        toppings_pineapple.getPizzas().add(hawaian);
        hawaian.setCalories();
        hawaian.setPrice();
        pizzarepo.save(hawaian);

        Pizza salami = context.getBean("margherita", Pizza.class);
        salami.setName("Salami");
        salami.getToppingList().add(toppings_salami);
        toppings_salami.getPizzas().add(salami);
        salami.setCalories();
        salami.setPrice();
        pizzarepo.save(salami);



    }
}
