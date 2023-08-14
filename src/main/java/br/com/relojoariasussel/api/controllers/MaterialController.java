package br.com.relojoariasussel.api.controllers;

import br.com.relojoariasussel.api.models.Material;
import br.com.relojoariasussel.api.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materials")
public class MaterialController {

    private final MaterialService materialService;

    @Autowired
    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public List<Material> getAllMaterials() {
        return materialService.getAllMaterials();
    }

    @GetMapping("/{id}")
    public Optional<Material> getMaterialById(@PathVariable Long id) {
        return materialService.getMaterialById(id);
    }

    @PostMapping
    public Material saveMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable Long id) {
        materialService.deleteMaterial(id);
    }

}
