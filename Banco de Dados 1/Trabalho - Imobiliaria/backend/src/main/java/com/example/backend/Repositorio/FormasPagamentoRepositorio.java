package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.FormasPagamento;

public interface FormasPagamentoRepositorio extends JpaRepository<FormasPagamento, Integer> {
    
}
