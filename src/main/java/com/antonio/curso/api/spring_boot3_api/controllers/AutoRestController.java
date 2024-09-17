package com.antonio.curso.api.spring_boot3_api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonio.curso.api.spring_boot3_api.models.Auto;
import com.antonio.curso.api.spring_boot3_api.services.AutoService;

@RestController
@RequestMapping("/api/autos")
public class AutoRestController {

    @Autowired
    private AutoService autoService;

/*     public AutoRestController(AutoService autoService) {
        this.autoService = autoService;
    } */

    @PostMapping(value="crear", headers = "Accept=application/json")
    public void crearAuto(@RequestBody Auto auto) {
        autoService.createAuto(auto);
    }
    
    @GetMapping(value="listar", headers = "Accept=application/json")
    public List<Auto> listarAutos() {
        return autoService.listarAutos();
    } 

    @GetMapping(value="listarPorId/{id}", headers = "Accept=application/json")
    public Optional<Auto> buscarPorId(@PathVariable Long id){
        return autoService.buscarPorId(id);
    }

    @PutMapping(value="actualizar", headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Auto auto) {
        autoService.actualizarAuto(auto);
    }

    @DeleteMapping(value="eliminar/{id}", headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long id){
        autoService.eliminarAutoPorId(id);
    }

    @GetMapping(value="listarPorMarca/{marca}", headers = "Accept=application/json")
    public List<Auto> listarPorMarca(@PathVariable String marca){
        return autoService.buscarPorMarca(marca);
    }


    @GetMapping(value="listarPorModelo/{modelo}", headers = "Accept=application/json")
    public List<Auto> listarPorModelo(@PathVariable String modelo){
        return autoService.buscarPorModels(modelo);
    }

    @GetMapping(value="listarPorColor/{color}", headers = "Accept=application/json")
    public List<Auto> listarPorColor(@PathVariable String color){
        return autoService.buscarPorColor(color);
    }

    @GetMapping(value="listarPorAnio/{anio}", headers = "Accept=application/json")
    public List<Auto> listarPorAnio(@PathVariable Long anio){
        return autoService.buscarPorAnio(anio);
    }

}
