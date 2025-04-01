package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.AccountsModel2;
import com.example.sns.projection.bank2.AccountsProjection2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository2 extends JpaRepository<AccountsModel2, Long> {

    List<AccountsProjection2> findAllProjectedBy();
}
