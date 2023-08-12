package br.com.relojoariasussel.api.controllers;

import br.com.relojoariasussel.api.models.Mechanism;
import br.com.relojoariasussel.api.services.MechanismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mechanisms")
public class MechanismController {

    private final MechanismService mechanismService;

    @Autowired
    public MechanismController(MechanismService mechanismService) {
        this.mechanismService = mechanismService;
    }

    @GetMapping
    public List<Mechanism> getAllMechanisms() {
        return mechanismService.getAllMechanisms();
    }

    @GetMapping("/{id}")
    public Optional<Mechanism> getMechanismById(@PathVariable Long id) {
        return mechanismService.getMechanismById(id);
    }

    @PostMapping
    public Mechanism saveMechanism(@RequestBody Mechanism mechanism) {
        return mechanismService.saveMechanism(mechanism);
    }

    @DeleteMapping("/{id}")
    public void deleteMechanism(@PathVariable Long id) {
        mechanismService.deleteMechanism(id);
    }
}
