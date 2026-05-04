package br.com.fiap.cs2_api.controller;

import br.com.fiap.cs2_api.model.Competitivo;
import br.com.fiap.cs2_api.repository.CompetitivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/${api.version}/casual")
public class CompetitivoController {
    @Autowired
    private CompetitivoRepository repository;

    @PostMapping
    public ResponseEntity<Competitivo> create(@RequestBody Competitivo competitivo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(competitivo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Competitivo> findById(@PathVariable Long id) {
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Competitivo>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Competitivo> update(@PathVariable Long id,
                                         @RequestBody Competitivo competitivo) {

        Optional<Competitivo> optCompetitivo = repository.findById(id);

        if (optCompetitivo.isPresent()) {
            competitivo.setId(id);
            Competitivo modoCompetitivoAlterado = repository.save(competitivo);
            return ResponseEntity.ok(modoCompetitivoAlterado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
