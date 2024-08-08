
package com.migrupo.videojuego.controller;

import com.migrupo.videojuego.domain.Videojuego;
import com.migrupo.videojuego.service.VideoJuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    
    private final VideoJuegoService videojuegoService;

    public ListadoController(VideoJuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
    
    
    //Trae listado de videojuegos
    @RequestMapping("/")
    public String listarVideojuegos(Model model){
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        System.out.println("videojuegos destacados " + destacados);
        for(int i=10; i < 10; i++)
            System.out.println("saliendo del método ");
        return "listado";
    }
}
