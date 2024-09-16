package com.antonio.curso.api.spring_boot3_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonio.curso.api.spring_boot3_api.models.Auto;
import com.antonio.curso.api.spring_boot3_api.repositories.IAutosRepository;

@Service
public class AutoService {

    @Autowired
    private IAutosRepository autoRepo;

    
/*     public AutoService(IAutosRepository autoRepo){
        this.autoRepo = autoRepo;
    } */

    //Metodo para crear Auto
    public void createAuto(Auto auto) {
        autoRepo.save(auto);
    }

    //Metodo para listar los autos de nuestra bbdd
    public List<Auto> listarAutos() {
        return autoRepo.findAll();
    }

    //Metodo para buscar un auto por un id especifico
    Optional<Auto> buscarPorId(Long id) {
        return autoRepo.findById(id);
    }

    //Metodo para actualizar un auto
    public void actualizarAuto(Auto auto) {
       autoRepo.save(auto); 
    }

    //Metodo para eliminar un auto
    public void eliminarAuto(Long id) {
        autoRepo.deleteById(id);
    }

    //Metodo para buscar según atributos propios de la clase
    List<Auto> buscarPorMarca(String marca) {
        return autoRepo.findByMarca(marca);
    }

    List<Auto> buscarPorModels(String modelo){
        return autoRepo.findByModelo(modelo);
    }

    List<Auto> buscarPorColor(String Color){
        return autoRepo.findByColor(Color);
    }

    List<Auto> buscarPorAnio(String anio) {
        return autoRepo.findByAnio(anio);
    }
}
