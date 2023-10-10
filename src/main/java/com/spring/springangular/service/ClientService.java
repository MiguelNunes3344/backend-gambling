package com.spring.springangular.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springangular.dtos.ClientDto;
import com.spring.springangular.dtos.NumberDto;
import com.spring.springangular.entity.Client;
import com.spring.springangular.repositories.ClientRepository;

@Service
public class ClientService {

	
	@Autowired
	ClientRepository clientRepository;
	
	
	public List<Client> getAll() {
		return clientRepository.findAll();	
	}
	public void saveClient(ClientDto clientDto) {
		Client client = new Client();
		client.setName(clientDto.name());
		client.setPassword(clientDto.password());
		client.setEmail(clientDto.email());
		client.setBalance(clientDto.balance());
		clientRepository.save(client);
	}
	public Double getBalance() {
		Optional<Client> client = clientRepository.findById(1L);
		return client.get().getBalance();
	}
	public void updateBalance(NumberDto numberDto) {
		Optional<Client> client = clientRepository.findById(1L);
		client.get().setBalance(this.getBalance() + numberDto.number());
		clientRepository.save(client.get());
	}
	public void withdrawBalance(NumberDto numberDto) {
		Optional<Client> client = clientRepository.findById(1L);
		client.get().setBalance(this.getBalance() - numberDto.number());
		clientRepository.save(client.get());
	}
	
}
