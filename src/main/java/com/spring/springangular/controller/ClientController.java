package com.spring.springangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springangular.dtos.ClientDto;
import com.spring.springangular.dtos.NumberDto;
import com.spring.springangular.entity.Client;
import com.spring.springangular.service.ClientService;
import com.spring.springangular.service.NumberService;

import jakarta.validation.Valid;
@RestController
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	
	@Autowired 
	NumberService numberService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity<List<Client>> getAll() {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(clientService.getAll());
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/number")
	public ResponseEntity<List<String>> getNumber()  {
		return ResponseEntity.status(HttpStatus.OK).body(numberService.getNumber());
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/balance")
	public ResponseEntity<Double> getBalance() {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.getBalance());
	}
			
	@PostMapping
	public ResponseEntity<Client> createUser(@RequestBody @Valid ClientDto clientDto) {
		clientService.saveClient(clientDto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/update")
	public ResponseEntity<Client> updateBalance(@RequestBody NumberDto numberDto) {
		clientService.updateBalance(numberDto);
		return ResponseEntity.status(HttpStatus.CREATED).build();	
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/withdraw")
	public ResponseEntity<Client> withdrawBalance(@RequestBody NumberDto numberDto) {
		clientService.withdrawBalance(numberDto);
		return ResponseEntity.status(HttpStatus.CREATED).build();	
	}
	
	
	
	
}
