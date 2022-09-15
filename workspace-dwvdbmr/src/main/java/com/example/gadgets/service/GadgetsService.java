package com.example.gadgets.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gadgets.entity.Gadgets;
import com.example.gadgets.repository.GadgetsRepository;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class GadgetsService {

	@Autowired
	GadgetsRepository gadgetsRepo;
	
	public List<Gadgets> getAllItems(){
//		return gadgetsRepo.findAll();/

		ArrayList<Gadgets> gadgets = new ArrayList<>();
		gadgetsRepo.findAll().forEach(gadgets::add);
		return gadgets;

	}
	
	public Optional<Gadgets> getItemsById(int itemId) {
//		Optional<Gadgets> byId = gadgetsRepo.findById(itemId); // optional


		if (gadgetsRepo.existsById(itemId)) {
			return gadgetsRepo.findById(itemId);
		}else{
			return null;
		}
	}

	public Gadgets saveGadget(Gadgets newGadget) {

		return gadgetsRepo.save(newGadget);

	}

	public void deleteGadgetById(Integer id) {
        if (gadgetsRepo.existsById(id)){
          gadgetsRepo.deleteById(id);
		}
	}

	public Gadgets editGadget(Gadgets newGadget,Integer gadgetsId){

		Gadgets gadget = gadgetsRepo.getById(gadgetsId);

		newGadget.setId(gadgetsId);
		gadget.setBrandName(newGadget.getBrandName());
		gadget.setItemName(newGadget.getItemName());
		gadget.setPrice(newGadget.getPrice());
		gadget.setUnits(newGadget.getUnits());

	return 	gadgetsRepo.save(gadget);

	}
}
//Student database management