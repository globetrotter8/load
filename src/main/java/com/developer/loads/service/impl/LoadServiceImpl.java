package com.developer.loads.service.impl;

import com.developer.loads.entity.LoadEntity;
import com.developer.loads.repository.LoadRepository;
import com.developer.loads.service.LoadService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadServiceImpl implements LoadService {
    private final LoadRepository loadRepository;

    public LoadServiceImpl(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    @Override
    public List<LoadEntity> findAllLoad() {
        return loadRepository.findAll();
    }

    @Override
    public Optional<LoadEntity> findById(Long id) {
        return loadRepository.findById(id);
    }

    @Override
    public LoadEntity saveLoad(LoadEntity loadEntity) {
        return loadRepository.save(loadEntity);
    }

    @Override
    public LoadEntity updateLoad(LoadEntity loadEntity) {
        return loadRepository.save(loadEntity);
    }

    @Override
    public void deleteLoad(Long id) {
        loadRepository.deleteById(id);

    }
}
