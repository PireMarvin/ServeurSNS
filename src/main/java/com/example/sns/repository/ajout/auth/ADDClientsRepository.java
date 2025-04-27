package com.example.sns.repository.ajout.auth;

import com.example.sns.model.ajout.auth.ADDClientsModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ADDClientsRepository extends MongoRepository<ADDClientsModel, Long> {
    Optional<ADDClientsModel> findById(ObjectId id);
}
