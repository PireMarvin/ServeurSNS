package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.AccountsModel;
import com.example.sns.projection.bank1.AccountsProjection;
import com.example.sns.projection.bank1.TransactionsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository extends JpaRepository<AccountsModel, Long> {

    List<AccountsProjection> findAllProjectedBy();
}
