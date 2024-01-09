package com.developer.loads.service;

import com.developer.loads.entity.LoadEntity;
import java.util.List;
import java.util.Optional;

public interface LoadService {
    List <LoadEntity> findAllLoad();
    Optional<LoadEntity> findById(Long id);
    LoadEntity saveLoad(LoadEntity loadEntity);
    LoadEntity updateLoad(LoadEntity loadEntity);
    void deleteLoad(Long id);
}
