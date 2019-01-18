package com.example.demo;

import com.example.demo.models.PlantInventoryEntry;
import com.example.demo.models.PlantInventoryEntryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication
public class DemoApplicationTests {

   /*
    @Test
    public void contextLoads() {
    }
*/

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        PlantInventoryEntryRepository repository = ctx.getBean(PlantInventoryEntryRepository.class);

        PlantInventoryEntry plant = new PlantInventoryEntry();
        plant.setName("Bike");
        plant.setDescription("Nice and shiny");
        plant.setPrice(BigDecimal.valueOf(100));

        repository.save(plant);

        System.out.println(repository.findAll());
    }

}

