package service;

import model.Treinador;

import java.util.List;

public interface TreinadorService {
    List<Treinador> findAll();
    Treinador findById(Long id);
    Treinador save(Treinador treinador);
    void deleteById(Long id);
}
