package controller;

import model.Treinador;
import service.TreinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/treinadores")
public class TreinadorController {

    @Autowired
    private TreinadorService treinadorService;

    @GetMapping
    public ResponseEntity<List<Treinador>> findAll() {
        List<Treinador> treinadores = treinadorService.findAll();
        return new ResponseEntity<>(treinadores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Treinador> findById(@PathVariable Long id) {
        Treinador treinador = treinadorService.findById(id);
        if (treinador != null) {
            return new ResponseEntity<>(treinador, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Treinador> save(@RequestBody Treinador treinador) {
        Treinador savedTreinador = treinadorService.save(treinador);
        return new ResponseEntity<>(savedTreinador, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Treinador> update(@PathVariable Long id, @RequestBody Treinador treinador) {
        Treinador existingTreinador = treinadorService.findById(id);
        if (existingTreinador != null) {
            treinador.setId(id);
            Treinador updatedTreinador = treinadorService.save(treinador);
            return new ResponseEntity<>(updatedTreinador, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        Treinador treinador = treinadorService.findById(id);
        if (treinador != null) {
            treinadorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
