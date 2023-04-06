package service;

import model.Estatistica;

import java.util.List;

public interface EstatisticaService {
    List<Estatistica> findAll();
    Estatistica findById(Long id);
    Estatistica save(Estatistica estatistica);
    void deleteById(Long id);
}
