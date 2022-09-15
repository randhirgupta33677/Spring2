package com.example.gadgets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.gadgets.entity.Gadgets;
import com.example.gadgets.service.GadgetsService;



@RestController
public class GadgetsController {

	@Autowired
	GadgetsService gadgetsService;

	@GetMapping(path = "/gadgets")
	public ResponseEntity<List<Gadgets>> getAllItem() {
		List<Gadgets> allItems = gadgetsService.getAllItems();

		if (allItems != null) {
			return new ResponseEntity<List<Gadgets>>(allItems, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Gadgets>>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(path = "/gadgets/{itemsId}")
	public ResponseEntity<Optional<Gadgets>> getItemById(@PathVariable int itemsId) {
		Optional<Gadgets> itemsById = gadgetsService.getItemsById(itemsId);
		if (itemsById != null) {
			return new ResponseEntity<Optional<Gadgets>>(itemsById, HttpStatus.OK);
		} else {
			return new ResponseEntity<Optional<Gadgets>>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/gadgets")
	public ResponseEntity<Gadgets> addGadget(@RequestBody Gadgets newGadget) {
		Gadgets gadgets = gadgetsService.saveGadget(newGadget);


//		if (gadgets.getBrandName()== null && gadgets.getBrandName().isEmpty() ){
//			return new ResponseEntity<Gadgets>(HttpStatus.BAD_REQUEST);
//		}
		return new ResponseEntity<>(newGadget, HttpStatus.CREATED);

	}


	@DeleteMapping("/gadgets/{gadgetsId}")
	public ResponseEntity<HttpStatus> deleteGadget(@PathVariable Integer gadgetsId) {
		gadgetsService.deleteGadgetById(gadgetsId);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@PutMapping("/gadgets/{gadgetsId}")
	public ResponseEntity<Gadgets> editGadget(@RequestBody Gadgets newGadget,@PathVariable Integer gadgetsId ){
		Gadgets gadgets = gadgetsService.editGadget(newGadget, gadgetsId);
		return new ResponseEntity<>(newGadget,HttpStatus.OK);

	}



}
