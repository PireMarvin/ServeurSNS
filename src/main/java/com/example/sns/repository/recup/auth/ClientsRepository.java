package com.example.sns.repository.recup.auth;

import com.example.sns.model.recup.auth.ClientsModel;
import com.example.sns.projection.auth.ClientProjection;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ClientsRepository extends MongoRepository<ClientsModel, ObjectId> {

    List<ClientProjection> findAllProjectedBy();

}
