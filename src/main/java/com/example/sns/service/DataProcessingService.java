package com.example.sns.service;

import com.example.sns.projection.bank1.*;
import com.example.sns.projection.bank1.ClientsProjection;
import com.example.sns.projection.services.DeliveryTrackingProjection;
import com.example.sns.projection.transac.*;
import com.example.sns.repository.bank1.*;
import com.example.sns.repository.bank1.ClientsRepository;

import com.example.sns.projection.bank2.*;
import com.example.sns.repository.bank2.*;

import com.example.sns.repository.services.*;
import com.example.sns.repository.transac.*;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataProcessingService {
    //Bank 1
    private final AccountsRepository accountsRepository;
    private final ClientsRepository bankclientsRepository;
    private final ExternalTransactionsRepository externalTransactionsRepository;
    private final TransactionsRepository transactionsRepository;

    //Bank 2
    private final AccountsRepository2 accountsRepository2;
    private final ClientsRepository2 bankclientsRepository2;
    private final ExternalTransactionsRepository2 externalTransactionsRepository2;
    private final TransactionsRepository2 transactionsRepository2;

    //Services
    private final DeliveryTrackingRepository deliveryTrackingRepository;
    /*private final ChatRepository chatRepository;
    private final CommentsRepository commentsRepository;
    private final SAVRepository savRepository;*/

    //Transac
    private final AdressesRepository adressesRepository;
    private final CategoriesRepository categoriesRepository;
    private final ClientsRepository clientsRepository;
    private final OrderLinesRepository orderLinesRepository;
    private final OrdersRepository ordersRepository;
    private final PaymentsRepository paymentsRepository;
    private final ProduitsRepository produitsRepository;
    private final StocksRepository stocksRepository;

    @Scheduled(cron = "0 0 3 * * ?") //exec every day at 3am
    public void fetchData(){
        //Bank 1
        List<AccountsProjection> accountsModels = accountsRepository.findAllProjectedBy();
        List<ClientsProjection> bankclientsModels = bankclientsRepository.findAllProjectedBy();
        List<ExternalTransactionsProjection> externalTransactionsModels = externalTransactionsRepository.findAllProjectedBy();
        List<TransactionsProjection> transactionsModels = transactionsRepository.findAllProjectedBy();

        //Bank 2
        List<AccountsProjection2> accountsModels2 = accountsRepository2.findAllProjectedBy();
        List<ClientsProjection2> bankclientsModels2 = bankclientsRepository2.findAllProjectedBy();
        List<ExternalTransactionsProjection2> externalTransactionsModels2 = externalTransactionsRepository2.findAllProjectedBy();
        List<TransactionsProjection2> transactionsModels2 = transactionsRepository2.findAllProjectedBy();

        //Services
        List<DeliveryTrackingProjection> deliveryTrackingModels = deliveryTrackingRepository.findAllProjectedBy();

        //Transac
        List<AdressesProjection> adressesModels = adressesRepository.findAllProjectedBy();
        List<CategoriesProjection> categoriesModels = categoriesRepository.findAllProjectedBy();
        List<ClientsProjection> clientsModels = clientsRepository.findAllProjectedBy();
        List<OrderLinesProjection> orderLinesModels = orderLinesRepository.findAllProjectedBy();
        List<OrdersProjection> ordersModels = ordersRepository.findAllProjectedBy();
        List<PaymentsProjection> paymentsModels = paymentsRepository.findAllProjectedBy();
        List<ProduitsProjection> produitsModels = produitsRepository.findAllProjectedBy();
        List<StocksProjection> stocksModels = stocksRepository.findAllProjectedBy();
    }


}
