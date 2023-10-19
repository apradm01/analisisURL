package com.analizarurl.demo.repository;

import com.analizarurl.demo.model.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepositorio extends JpaRepository<Keyword,Long> {
}
