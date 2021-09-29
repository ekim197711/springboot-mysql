package com.example.springmysql.space;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spaceship")
public class SpaceRestController {
    private final SpaceShipRepository repository;
    @Autowired
    public SpaceRestController(SpaceShipRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/")
    public Iterable<SpaceShip> allShips(){
        return repository.findAll();
    }

    @PostMapping("/{captain}/{fuel}")
    public Iterable<SpaceShip> createShips(@PathVariable String captain, @PathVariable int fuel){
        repository.save(new SpaceShip(captain, fuel));
        return repository.findAll();
    }

    @PostMapping
    public void onStartUp()
    {
        repository.deleteAll();
    }
}
