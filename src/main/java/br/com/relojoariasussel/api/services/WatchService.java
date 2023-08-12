package br.com.relojoariasussel.api.services;

import br.com.relojoariasussel.api.models.Watch;
import br.com.relojoariasussel.api.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WatchService {

    private final WatchRepository watchRepository;

    @Autowired
    public WatchService(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    public List<Watch> getAllWatches() {
        return watchRepository.findAll();
    }

    public Optional<Watch> getWatchById(Long id) {
        return watchRepository.findById(id);
    }

    public Watch saveWatch(Watch watch) {
        return watchRepository.save(watch);
    }

    public void deleteWatch(Long id) {
        watchRepository.deleteById(id);
    }
}