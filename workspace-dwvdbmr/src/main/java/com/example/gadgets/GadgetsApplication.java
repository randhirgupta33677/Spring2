package com.example.gadgets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.gadgets.entity.Gadgets;
import com.example.gadgets.repository.GadgetsRepository;


@SpringBootApplication
public class GadgetsApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(GadgetsApplication.class, args);
		
		GadgetsRepository gadgetsRepo = context.getBean(GadgetsRepository.class);
		
		Gadgets gadgets = new Gadgets();
		gadgets.setItemName("Mobile");
		gadgets.setBrandName("Vivo");
		gadgets.setUnits(5);
		gadgets.setPrice(13000.00);
		gadgetsRepo.save(gadgets);
		
		Gadgets gadgets1 = new Gadgets();
		gadgets1.setItemName("Washing Machine");
		gadgets1.setBrandName("LG");
		gadgets1.setUnits(3);
		gadgets1.setPrice(15000.00);
		gadgetsRepo.save(gadgets1);
	}

}
