package it.epicode.U5_W1_D3.runner;


import it.epicode.U5_W1_D3.entities.Drink;
import it.epicode.U5_W1_D3.repo.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Order(2)
public class DrinkRunner implements ApplicationRunner {
    @Autowired
    private DrinkRepository drinkRepo;
    @Autowired
    private Drink water;
    @Autowired
    private Drink lemonsoda;
    @Autowired
    private Drink wine;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        drinkRepo.save(water);
        drinkRepo.save(lemonsoda);
        drinkRepo.save(wine);
    }
}