package com.analizarurl.demo.repository;

import com.analizarurl.demo.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TituloRepositorio extends JpaRepository<Titulo, Long> {
}
