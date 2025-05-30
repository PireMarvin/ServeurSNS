package com.example.sns.repository.recup.bank1;

import com.example.sns.model.recup.bank1.AccountsModel;
import com.example.sns.projection.bank1.AccountsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository extends JpaRepository<AccountsModel, Long> {

    List<AccountsProjection> findAllProjectedBy();
}
