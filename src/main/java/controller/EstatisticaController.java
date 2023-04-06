package controller;

import model.Estatistica;
import service.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estatisticas")
public class EstatisticaController {

    @Autowired
    private EstatisticaService estatisticaService;

    @GetMapping
    public ResponseEntity<List<Estatistica>> findAll() {
        List<Estatistica> estatisticas = estatisticaService.findAll();
        return new ResponseEntity<>(estatisticas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estatistica> findById(@PathVariable Long id) {
        Estatistica estatistica = estatisticaService.findById(id);
        if (estatistica != null) {
            return new ResponseEntity<>(estatistica, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Estatistica> save(@RequestBody Estatistica estatistica) {
        Estatistica savedEstatistica = estatisticaService.save(estatistica);
        return new ResponseEntity<>(savedEstatistica, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estatistica> update(@PathVariable Long id, @RequestBody Estatistica estatistica) {
        Estatistica existingEstatistica = estatisticaService.findById(id);
        if (existingEstatistica != null) {
            estatistica.setId(id);
            Estatistica updatedEstatistica = estatisticaService.save(estatistica);
            return new ResponseEntity<>(updatedEstatistica, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        Estatistica estatistica = estatisticaService.findById(id);
        if (estatistica != null) {
            estatisticaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

