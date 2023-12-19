package com.example.service;

import com.example.dao.ActorDAO;
import com.example.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActorServiceImp implements ActorService{

    private ActorDAO actorDAO;
    @Autowired
    public ActorServiceImp(ActorDAO actorDAO){
        this.actorDAO = actorDAO;
    }
    @Override
    public List<Actor> findAll() {
        return actorDAO.findAll();
    }

    @Override
    public Actor findById(int id) {
        return actorDAO.findById(id);
    }

    @Override
    public Actor update(Actor actor) {
        return actorDAO.update(actor);
    }

    @Override
    public void deleteById(int id) {
        actorDAO.deleteById(id);
    }

    @Override
    public Actor add(Actor actor) {
        return actorDAO.add(actor);
    }
}
