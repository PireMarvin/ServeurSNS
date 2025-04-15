package com.example.sns.service;

import com.example.sns.projection.services.*;
import com.example.sns.projection.transac.*;


import com.example.sns.repository.recup.services.DeliveryTrackingRepository;
import com.example.sns.repository.recup.transac.*;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataProcessingService {
    //Bank 1
    /*private final AccountsRepository accountsRepository;
    private final BankClientsRepository bankclientsRepository;
    private final ExternalTransactionsRepository externalTransactionsRepository;
    private final TransactionsRepository transactionsRepository;*/

    //Bank 2
    /*private final AccountsRepository2 accountsRepository2;
    private final BankClientsRepository2 bankclientsRepository2;
    private final ExternalTransactionsRepository2 externalTransactionsRepository2;
    private final TransactionsRepository2 transactionsRepository2;*/

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
    private final ProductsRepository productsRepository;
    private final StocksRepository stocksRepository;

    //@Scheduled(cron = "0 0 3 * * ?") //exec every day at 3am
    //@Scheduled(fixedRate = 6000)

    public void fetchData(){
        //Bank 1
        /*List<AccountsProjection> accountsModels = accountsRepository.findAllProjectedBy();
        List<BankClientsProjection> bankclientsModels = bankclientsRepository.findAllProjectedBy();
        List<ExternalTransactionsProjection> externalTransactionsModels = externalTransactionsRepository.findAllProjectedBy();
        List<TransactionsProjection> transactionsModels = transactionsRepository.findAllProjectedBy();

        //Bank 2
        List<AccountsProjection2> accountsModels2 = accountsRepository2.findAllProjectedBy();
        List<BankClientsProjection2> bankclientsModels2 = bankclientsRepository2.findAllProjectedBy();
        List<ExternalTransactionsProjection2> externalTransactionsModels2 = externalTransactionsRepository2.findAllProjectedBy();
        List<TransactionsProjection2> transactionsModels2 = transactionsRepository2.findAllProjectedBy();*/

        //Services
        List<DeliveryTrackingProjection> deliveryTrackingModels = deliveryTrackingRepository.findAllProjectedBy();

        //Transac
        List<AdressesProjection> adressesModels = adressesRepository.findAllProjectedBy();
        List<CategoriesProjection> categoriesModels = categoriesRepository.findAllProjectedBy();
        List<ClientsProjection> clientsModels = clientsRepository.findAllProjectedBy();
        List<OrderLinesProjection> orderLinesModels = orderLinesRepository.findAllProjectedBy();
        List<OrdersProjection> ordersModels = ordersRepository.findAllProjectedBy();
        List<PaymentsProjection> paymentsModels = paymentsRepository.findAllProjectedBy();
        List<ProductsProjection> productsModels = productsRepository.findAllProjectedBy();
        List<StocksProjection> stocksModels = stocksRepository.findAllProjectedBy();

//        System.out.println(deliveryTrackingModels);
//        System.out.println(adressesModels);
        adressesModels.forEach(adresse -> {
            System.out.println("ID: " + adresse.getId());
            System.out.println("City: " + adresse.getCity());
            System.out.println("Country: " + adresse.getCountry());
        });

//        System.out.println(categoriesModels);
//        System.out.println(clientsModels);
//        System.out.println(orderLinesModels);
//        System.out.println(ordersModels);
//        System.out.println(paymentsModels);
//        System.out.println(produitsModels);
//        System.out.println(stocksModels);
    }


}
