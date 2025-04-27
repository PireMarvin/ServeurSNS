package com.example.sns.repository.recup.transac;

import com.example.sns.model.recup.transac.UsersModel;
import com.example.sns.projection.transac.UsersProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<UsersModel, Long> {

    List<UsersProjection> findAllProjectedBy();
}
