package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Cargo;
import com.example.demo.repository.CargoRepository;

@Service
public class CargoService {
    
    @Autowired
    CargoRepository cargoRepository;

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public Cargo findById(Long codcar) {
        return cargoRepository.findById(codcar)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.OK));
    }

    public Cargo save(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public void deleteById(Long codcar) {
        Cargo cargoEncontrado = findById(codcar);
        cargoRepository.delete(cargoEncontrado);
    }

}
