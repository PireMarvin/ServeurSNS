package com.example.sns.repository.bank2;

import com.example.sns.model.bank2.AccountsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<AccountsModel, Long> {
}
