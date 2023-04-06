package service;

import model.Estatistica;
import repository.EstatisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstatisticaServiceImpl implements EstatisticaService {

    @Autowired
    private EstatisticaRepository estatisticaRepository;

    @Override
    public List<Estatistica> findAll() {
        return estatisticaRepository.findAll();
    }

    @Override
    public Estatistica findById(Long id) {
        Optional<Estatistica> estatisticaOptional = estatisticaRepository.findById(id);
        return estatisticaOptional.orElse(null);
    }

    @Override
    public Estatistica save(Estatistica estatistica) {
        return estatisticaRepository.save(estatistica);
    }

    @Override
    public void deleteById(Long id) {
        estatisticaRepository.deleteById(id);
    }
}
