package com.developer.loads.controller;

import com.developer.loads.entity.LoadEntity;
import com.developer.loads.service.LoadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/load")
public class LoadController {
    private final LoadService loadService;

    public LoadController(LoadService loadService) {
        this.loadService = loadService;
    }

    @GetMapping
    public List<LoadEntity> findAllLoad(){
        return loadService.findAllLoad();
    }

    @GetMapping("/{id}")
    public Optional<LoadEntity> findLoadById(@PathVariable("id") Long id){
        return loadService.findById(id);
    }

    @PostMapping
    public LoadEntity saveLoad(@RequestBody LoadEntity loadEntity){
        return loadService.saveLoad(loadEntity);
    }

    @PutMapping
    public LoadEntity updateLoad(@RequestBody LoadEntity loadEntity){
        return loadService.updateLoad(loadEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteLoad(@PathVariable("id") Long id)
    {
        loadService.deleteLoad(id);
    }
}
