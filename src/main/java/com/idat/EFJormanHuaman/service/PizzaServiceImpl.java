package com.idat.EFJormanHuaman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFJormanHuaman.model.Pizza;
import com.idat.EFJormanHuaman.repository.PizzaRepository;


@Service
public class PizzaServiceImpl  implements PizzaService {

	@Autowired
	private PizzaRepository repository;
	
	@Override
	public List<Pizza> listar() {
		
		return repository.findAll();
	}

	@Override
	public Pizza obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizza pizza) {
		// TODO Auto-generated method stub
		repository.save(null);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteAllById(null);
	}

	@Override
	public void actualizar(Pizza pizza) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(null);
	}

}