package br.com.relojoariasussel.api.services;

import br.com.relojoariasussel.api.models.Mechanism;
import br.com.relojoariasussel.api.repositories.MechanismRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MechanismService {

    private final MechanismRepository mechanismRepository;

    @Autowired
    public MechanismService(MechanismRepository mechanismRepository) {
        this.mechanismRepository = mechanismRepository;
    }

    public List<Mechanism> getAllMechanisms() {
        return mechanismRepository.findAll();
    }

    public Optional<Mechanism> getMechanismById(Long id) {
        return mechanismRepository.findById(id);
    }

    public Mechanism saveMechanism(Mechanism mechanism) {
        return mechanismRepository.save(mechanism);
    }

    public void deleteMechanism(Long id) {
        mechanismRepository.deleteById(id);
    }
}
