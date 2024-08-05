package com.migrupo.videojuego.service;

import com.migrupo.videojuego.domain.Videojuego;
import com.migrupo.videojuego.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideoJuegoService {
    
    private final VideojuegoRepository videojuegoRepository;

    public VideoJuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    //Trae listado de videojuegos
    public List<Videojuego> buscarDestacados() {
        return videojuegoRepository.findAll();
    }

}
