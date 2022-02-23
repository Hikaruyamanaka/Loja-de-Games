package com.lojagames.lojaGames.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojagames.lojaGames.repository.CategoriaRepository;

@RestController
@RequestMapping ("/categorias")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	 private CategoriaRepository repository ;
}
