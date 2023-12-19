package com.example.service;

import com.example.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();
    Actor findById(int id);
    Actor update(Actor actor);
    void deleteById(int id);
    Actor add(Actor actor);
}
