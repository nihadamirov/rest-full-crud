package com.example.rest;

import com.example.entity.Actor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ActorRestController {

    @GetMapping("/actors")
    public List<Actor> findAll(){
        return null;
    }

    @GetMapping("/actors/{actorId}")
    public List<Actor> findById(@PathVariable int actorId){
        return null;
    }

    @PutMapping("/actors")
    public Actor update(@RequestBody Actor actor){
        return null;
    }

    @GetMapping("/actors/{actorId}")
    public void deleteById(@PathVariable int actorId){

    }

    @PostMapping("/actors")
    public Actor add(@RequestBody Actor actor){
        return null;
    }
}
