package com.analizarurl.demo.repository;

import com.analizarurl.demo.model.Titulos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitulosRepositorio extends JpaRepository<Titulos, Long> {
}
