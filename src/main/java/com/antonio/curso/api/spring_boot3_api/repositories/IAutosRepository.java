package com.antonio.curso.api.spring_boot3_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antonio.curso.api.spring_boot3_api.models.Auto;
import java.util.List;


@Repository
public interface IAutosRepository extends JpaRepository<Auto, Long>{
    List<Auto> findByMarca(String marca);
    List<Auto> findByColor(String color);
    List<Auto> findByModelo(String modelo);
    List<Auto> findByAnio(Long anio);

}
