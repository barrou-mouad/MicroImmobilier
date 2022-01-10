package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.Immobilier;

public interface ImmobilierRepository extends MongoRepository<Immobilier, String>{

}
