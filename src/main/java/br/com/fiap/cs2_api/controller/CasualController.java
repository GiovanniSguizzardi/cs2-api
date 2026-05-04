package br.com.fiap.cs2_api.controller;

import br.com.fiap.cs2_api.model.Casual;
import br.com.fiap.cs2_api.repository.CasualRepository;
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
public class CasualController {

    @Autowired
    private CasualRepository repository;

    @PostMapping
    public ResponseEntity<Casual> create(@RequestBody Casual casual) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(casual));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Casual> findById(@PathVariable Long id) {
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Casual>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Casual> update(@PathVariable Long id,
                                        @RequestBody Casual casual) {

        Optional<Casual> optCasual = repository.findById(id);

        if (optCasual.isPresent()) {
            casual.setId(id);
            Casual modoCasualAlterado = repository.save(casual);
            return ResponseEntity.ok(modoCasualAlterado);
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