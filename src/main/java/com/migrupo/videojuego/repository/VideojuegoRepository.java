
package com.migrupo.videojuego.repository;

import com.migrupo.videojuego.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

//Implementa las funciones CRUD de la tabla videojuego

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
    
    
}
