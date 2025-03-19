package com.example.sns.repository.bank1;

import com.example.sns.model.bank1.AccountsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<AccountsModel, Long> {
}
