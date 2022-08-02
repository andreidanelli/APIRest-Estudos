package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cargo;
import com.example.demo.service.CargoService;

@RestController
@RequestMapping("/api/cargos")
public class CargoController {
    
    @Autowired
    private CargoService cargoService;

    @GetMapping()
    public List<Cargo> findAll() {
        return cargoService.findAll();
    }

    @PostMapping("/cadastrar")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cargo save(@RequestBody Cargo cargo) {
        return cargoService.save(cargo);
    }

    @GetMapping("/{codcar}")
    public Cargo findById(@PathVariable Long codcar) {
        return cargoService.findById(codcar);
    }

    @DeleteMapping("/deletar/{codcar}")
    public void deleteById(@PathVariable Long codcar) {
        cargoService.deleteById(codcar);
    }
}
