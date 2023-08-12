package br.com.relojoariasussel.api.controllers;

import br.com.relojoariasussel.api.models.Watch;
import br.com.relojoariasussel.api.services.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/watches")
public class WatchController {

    private final WatchService watchService;

    @Autowired
    public WatchController(WatchService watchService) {
        this.watchService = watchService;
    }

    @GetMapping
    public ResponseEntity<List<Watch>> getAll() {
        List<Watch> watchList = watchService.getAllWatches();
        return new ResponseEntity<>(watchList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Watch> getWatchById(@PathVariable Long id) {
        Optional<Watch> watch = watchService.getWatchById(id);
        return watch.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Watch> createWatch(@RequestBody Watch watch) {
        Watch savedWatch = watchService.saveWatch(watch);
        return new ResponseEntity<>(savedWatch, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWatch(@PathVariable Long id) {
        watchService.deleteWatch(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
