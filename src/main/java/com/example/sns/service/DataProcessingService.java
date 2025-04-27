package com.example.sns.service;

import com.example.sns.model.ajout.activities.*;
import com.example.sns.model.ajout.auth.ADDClientsModel;
import com.example.sns.model.recup.auth.ClientsModel;
import com.example.sns.projection.auth.ClientProjection;
import com.example.sns.projection.bank1.*;
import com.example.sns.projection.bank2.*;
import com.example.sns.projection.transac.*;


import com.example.sns.repository.ajout.activities.*;
import com.example.sns.repository.ajout.auth.ADDClientsRepository;
import com.example.sns.repository.recup.auth.ClientsRepository;
import com.example.sns.repository.recup.bank1.*;
import com.example.sns.repository.recup.bank2.*;
import com.example.sns.repository.recup.transac.*;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DataProcessingService {
    //Bank 1
    private final AccountsRepository accountsRepository;
    private final BankClientsRepository bankclientsRepository;
    private final ExternalTransactionsRepository externalTransactionsRepository;
    private final TransactionsRepository transactionsRepository;

    //Bank 2
    private final AccountsRepository2 accountsRepository2;
    private final BankClientsRepository2 bankclientsRepository2;
    private final ExternalTransactionsRepository2 externalTransactionsRepository2;
    private final TransactionsRepository2 transactionsRepository2;

    //Services
    //private final DeliveryTrackingRepository deliveryTrackingRepository;
    //private final ChatRepository chatRepository;
    //private final CommentsRepository commentsRepository;
    //private final SAVRepository savRepository;

    //Transac
    private final AdressesRepository adressesRepository;
    private final CategoriesRepository categoriesRepository;
    private final UsersRepository usersRepository;
    private final OrderLinesRepository orderLinesRepository;
    private final OrdersRepository ordersRepository;
    private final PaymentsRepository paymentsRepository;
    private final ProductsRepository productsRepository;
    private final StocksRepository stocksRepository;

    //Auth
    private final ClientsRepository clientsRepository;

    //Activities
    private final ADDAccounts_1Repository addAccounts1Repository;
    private final ADDAccounts_2Repository addAccounts2Repository;
    private final ADDAdressesRepository addAdressesRepository;
    private final ADDCategoriesRepository addCategoriesRepository;
    private final ADDChatRepository addChatRepository;
    private final ADDClients_1Repository addClients1Repository;
    private final ADDClients_2Repository addClients2Repository;
    private final ADDCommentsRepository addCommentsRepository;
    private final ADDDelivery_trackingRepository addDeliveryTrackingRepository;;
    private final ADDExternal_transactions_1Repository addExternalTransactions1Repository;
    private final ADDExternal_transactions_2Repository addExternalTransactions2Repository;
    private final ADDOrder_linesRepository addOrderLinesRepository;
    private final ADDOrdersRepository addOrdersRepository;
    private final ADDPaymentsRepository addPaymentsRepository;
    private final ADDProductsRepository addProductsRepository;
    private final ADDSavRepository addSavRepository;
    private final ADDStockRepository addStockRepository;
    private final ADDTransactions_1Repository addTransactions1Repository;
    private final ADDTransactions_2Repository addTransactions2Repository;
    private final ADDUsersRepository addUsersRepository;

    //Auth ADD
    private final ADDClientsRepository addClientsRepository;

    //@Scheduled(cron = "0 0 3 * * ?") //exec every day at 3am
    //@Scheduled(fixedRate = 6000)
    @Scheduled(fixedRate = 120000) // Pour toutes les 2 minutes

    public void fetchData(){
        //Bank 1
        List<AccountsProjection> accountsModels = accountsRepository.findAllProjectedBy();
        List<BankClientsProjection> bankclientsModels = bankclientsRepository.findAllProjectedBy();
        List<ExternalTransactionsProjection> externalTransactionsModels = externalTransactionsRepository.findAllProjectedBy();
        List<TransactionsProjection> transactionsModels = transactionsRepository.findAllProjectedBy();

        //Bank 2
        List<AccountsProjection2> accountsModels2 = accountsRepository2.findAllProjectedBy();
        List<BankClientsProjection2> bankclientsModels2 = bankclientsRepository2.findAllProjectedBy();
        List<ExternalTransactionsProjection2> externalTransactionsModels2 = externalTransactionsRepository2.findAllProjectedBy();
        List<TransactionsProjection2> transactionsModels2 = transactionsRepository2.findAllProjectedBy();

        //Services
        //List<DeliveryTrackingProjection> deliveryTrackingModels = deliveryTrackingRepository.findAllProjectedBy();

        //Transac
        List<AdressesProjection> adressesModels = adressesRepository.findAllProjectedBy();
        List<CategoriesProjection> categoriesModels = categoriesRepository.findAllProjectedBy();
        List<UsersProjection> usersModels = usersRepository.findAllProjectedBy();
        List<OrderLinesProjection> orderLinesModels = orderLinesRepository.findAllProjectedBy();
        List<OrdersProjection> ordersModels = ordersRepository.findAllProjectedBy();
        List<PaymentsProjection> paymentsModels = paymentsRepository.findAllProjectedBy();
        List<ProductsProjection> productsModels = productsRepository.findAllProjectedBy();
        List<StocksProjection> stocksModels = stocksRepository.findAllProjectedBy();

        //Auth
        List<ClientProjection> clientsModels = clientsRepository.findAllProjectedBy();
        System.out.println("clientsModels = " + clientsModels);


        //List<ClientProjection> clientsModels = clientsRepository.findAllProjectedBy();
        //System.out.println("clientsModels = " + clientsModels);

        //Mapping
        List<ADDAccounts_1Model> comptes = accountsModels.stream().map(proj -> {
            // Recherche de l'entité par son identifiant dans la base cible
            Optional<ADDAccounts_1Model> existing = addAccounts1Repository.findById(proj.getAccountId());
            if (existing.isPresent()) {
                // Si l'entité existe déjà, on met à jour la balance et les autres informations
                ADDAccounts_1Model exist = existing.get();
                exist.setBalance(proj.getBalance());
                exist.setClientId(proj.getClientId()); // Si tu veux mettre à jour d'autres données
                return exist;  // Retourne l'entité mise à jour
            } else {
                // Si l'entité n'existe pas, on la crée avec les nouvelles données
                return ADDAccounts_1Model.builder()
                        .clientId(proj.getClientId())
                        .accountId(proj.getAccountId())  // Assurez-vous que l'accountId est bien défini
                        .balance(proj.getBalance())
                        .build();  // Crée une nouvelle entité avec les informations données
            }
        }).collect(Collectors.toList());


        List<ADDAccounts_2Model> comptes2 = accountsModels2.stream().map(proj -> {
            Optional<ADDAccounts_2Model> existing = addAccounts2Repository.findById(proj.getAccountId());
            if (existing.isPresent()) {
                ADDAccounts_2Model exist = existing.get();
                exist.setBalance(proj.getBalance());
                return exist;
            } else {
                return ADDAccounts_2Model.builder()
                        .clientId(proj.getClientId())
                        .balance(proj.getBalance())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDAdressesModel> adresses = adressesModels.stream().map(proj -> {
            Optional<ADDAdressesModel> existing = addAdressesRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDAdressesModel exist = existing.get();
                exist.setCity(proj.getCity());
                exist.setCountry(proj.getCountry());
                return exist;
            } else {
                return ADDAdressesModel.builder()
                        .addressesId(proj.getId())
                        .city(proj.getCity())
                        .country(proj.getCountry())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDCategoriesModel> categories = categoriesModels.stream().map(proj -> {
            Optional<ADDCategoriesModel> existing = addCategoriesRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDCategoriesModel exist = existing.get();
                exist.setName(proj.getName());
                exist.setDescription(proj.getDescription());
                return exist;
            } else {
                return ADDCategoriesModel.builder()
                        .ID(proj.getId())
                        .name(proj.getName())
                        .description(proj.getDescription())
                        .build();
            }
        }).collect(Collectors.toList());

        /*List<ADDChatModel> chats = chatRepository.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDChatModel> existing = addChatRepository.findById(proj.getID());
            if (existing.isPresent()) {
                ADDChatModel exist = existing.get();
                exist.setSenderId(proj.getSenderId());
                exist.setMessage(proj.getMessage());
                return exist;
            } else {
                return ADDChatModel.builder()
                        .ID(proj.getID())
                        .senderId(proj.getSenderId())
                        .message(proj.getMessage())
                        .build();
            }
        }).collect(Collectors.toList());*/


        List<ADDClients_1Model> bankClients1 = bankclientsRepository.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDClients_1Model> existing = addClients1Repository.findById(proj.getClientId());
            if (existing.isPresent()) {
                ADDClients_1Model exist = existing.get();
                exist.setGender(proj.getGender());
                exist.setBirthDate(proj.getBirthDate());
                exist.setMaritalStatus(proj.getMaritalStatus());
                exist.setMonthlyIncome(proj.getMonthlyIncome());
                exist.setBankName(proj.getBankName());
                return exist;
            } else {
                return ADDClients_1Model.builder()
                        .clientId(proj.getClientId())
                        .gender(proj.getGender())
                        .birthDate(proj.getBirthDate())
                        .maritalStatus(proj.getMaritalStatus())
                        .monthlyIncome(proj.getMonthlyIncome())
                        .bankName(proj.getBankName())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDClients_2Model> bankClients2 = bankclientsRepository2.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDClients_2Model> existing = addClients2Repository.findById(proj.getClientId());
            if (existing.isPresent()) {
                ADDClients_2Model exist = existing.get();
                exist.setGender(proj.getGender());
                exist.setBirthDate(proj.getBirthDate());
                exist.setMaritalStatus(proj.getMaritalStatus());
                exist.setMonthlyIncome(proj.getMonthlyIncome());
                exist.setBankName(proj.getBankName());
                return exist;
            } else {
                return ADDClients_2Model.builder()
                        .clientId(proj.getClientId())
                        .gender(proj.getGender())
                        .birthDate(proj.getBirthDate())
                        .maritalStatus(proj.getMaritalStatus())
                        .monthlyIncome(proj.getMonthlyIncome())
                        .bankName(proj.getBankName())
                        .build();
            }
        }).collect(Collectors.toList());

        /*List<ADDCommentsModel> comments = commentsRepository.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDCommentsModel> existing = addCommentsRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDCommentsModel exist = existing.get();
                exist.setCustomerId(proj.getCustomerId());
                exist.setProductId(proj.getProductId());
                exist.setRating(proj.getRating());
                exist.setCreatedAt(proj.getCreatedAt());
                return exist;
            } else {
                return ADDCommentsModel.builder()
                        .customerId(proj.getCustomerId())
                        .productId(proj.getProductId())
                        .rating(proj.getRating())
                        .createdAt(proj.getCreatedAt())
                        .build();
            }
        }).collect(Collectors.toList());*/

        /*List<ADDDelivery_trackingModel> deliveryTrackings = deliveryTrackingRepository.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDDelivery_trackingModel> existing = addDeliveryTrackingRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDDelivery_trackingModel exist = existing.get();
                exist.setOrderId(proj.getOrderId());
                exist.setShipmentDate(proj.getShipmentDate());
                exist.setEstimateDeliveryDate(proj.getEstimateDeliveryDate());
                exist.setAddressId(proj.getAddressId());
                return exist;
            } else {
                return ADDDelivery_trackingModel.builder()
                        .orderId(proj.getOrderId())
                        .shipmentDate(proj.getShipmentDate())
                        .estimateDeliveryDate(proj.getEstimateDeliveryDate())
                        .addressId(proj.getAddressId())
                        .build();
            }
        }).collect(Collectors.toList());*/

        List<ADDExternal_transactions_1Model> externalTransactions1 = externalTransactionsModels.stream().map(proj -> {
            Optional<ADDExternal_transactions_1Model> existing = addExternalTransactions1Repository.findById(proj.getExternalTransactionId());
            if (existing.isPresent()) {
                ADDExternal_transactions_1Model exist = existing.get();
                exist.setLocalTransactionId(proj.getLocalTransactionId());
                exist.setStatus(proj.getStatus());
                return exist;
            } else {
                return ADDExternal_transactions_1Model.builder()
                        .externalTransactionId(proj.getExternalTransactionId())
                        .localTransactionId(proj.getLocalTransactionId())
                        .status(proj.getStatus())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDExternal_transactions_2Model> externalTransactions2 = externalTransactionsModels2.stream().map(proj -> {
            Optional<ADDExternal_transactions_2Model> existing = addExternalTransactions2Repository.findById(proj.getexternalTransactionId());
            if (existing.isPresent()) {
                ADDExternal_transactions_2Model exist = existing.get();
                exist.setLocalTransactionId(proj.getlocalTransactionId());
                exist.setStatus(proj.getStatus());
                return exist;
            } else {
                return ADDExternal_transactions_2Model.builder()
                        .externalTransactionId(proj.getexternalTransactionId())
                        .localTransactionId(proj.getlocalTransactionId())
                        .status(proj.getStatus())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDOrder_linesModel> orderLines = orderLinesModels.stream().map(proj -> {
            Optional<ADDOrder_linesModel> existing = addOrderLinesRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDOrder_linesModel exist = existing.get();
                exist.setOrderId(proj.getOrderId());
                exist.setProductId(proj.getProductId());
                exist.setQuantity(proj.getQuantity());
                return exist;
            } else {
                return ADDOrder_linesModel.builder()
                        .ID(proj.getId())
                        .orderId(proj.getOrderId())
                        .productId(proj.getProductId())
                        .quantity(proj.getQuantity())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDOrdersModel> orders = ordersModels.stream().map(proj -> {
            Optional<ADDOrdersModel> existing = addOrdersRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDOrdersModel exist = existing.get();
                exist.setClientId(proj.getClientId());
                exist.setOrderDate(proj.getOrderDate());
                exist.setOrderTime(proj.getOrderTime());
                exist.setTotal(proj.getTotal());
                exist.setStatus(proj.getStatus());
                exist.setBankName(proj.getBankName());
                exist.setTrackingId(proj.getTrackingId());
                exist.setAddressId(proj.getAddressId());
                return exist;
            } else {
                return ADDOrdersModel.builder()
                        .ID(proj.getId())
                        .clientId(proj.getClientId())
                        .orderDate(proj.getOrderDate())
                        .orderTime(proj.getOrderTime())
                        .total(proj.getTotal())
                        .status(proj.getStatus())
                        .bankName(proj.getBankName())
                        .trackingId(proj.getTrackingId())
                        .addressId(proj.getAddressId())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDPaymentsModel> payments = paymentsModels.stream().map(proj -> {
            Optional<ADDPaymentsModel> existing = addPaymentsRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDPaymentsModel exist = existing.get();
                exist.setOrderId(proj.getOrderId());
                exist.setAmount(proj.getAmount());
                exist.setStatus(proj.getStatus());
                exist.setPayementDate(proj.getPaymentDate());
                exist.setPaymentMethod(proj.getPaymentMethod());
                return exist;
            } else {
                return ADDPaymentsModel.builder()
                        .ID(proj.getId())
                        .orderId(proj.getOrderId())
                        .amount(proj.getAmount())
                        .status(proj.getStatus())
                        .payementDate(proj.getPaymentDate())
                        .paymentMethod(proj.getPaymentMethod())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDProductsModel> products = productsModels.stream().map(proj -> {
            Optional<ADDProductsModel> existing = addProductsRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDProductsModel exist = existing.get();
                exist.setName(proj.getName());
                exist.setPrice(proj.getPrice());
                exist.setCategoryId(proj.getCategoryId());
                return exist;
            } else {
                return ADDProductsModel.builder()
                        .id(proj.getId())
                        .name(proj.getName())
                        .price(proj.getPrice())
                        .categoryId(proj.getCategoryId())
                        .build();
            }
        }).collect(Collectors.toList());

        /*List<ADDSavModel> savList = savRepository.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDSavModel> existing = addSavRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDSavModel exist = existing.get();
                exist.setCustomerId(proj.getCustomerId());
                exist.setOrderId(proj.getOrderId());
                exist.setRequestType(proj.getRequestType());
                exist.setCreatedAt(proj.getCreatedAt());
                exist.setUpdatedAt(proj.getUpdatedAt());
                return exist;
            } else {
                return ADDSavModel.builder()
                        .id(proj.getId())
                        .customerId(proj.getCustomerId())
                        .orderId(proj.getOrderId())
                        .requestType(proj.getRequestType())
                        .createdAt(proj.getCreatedAt())
                        .updatedAt(proj.getUpdatedAt())
                        .build();
            }
        }).collect(Collectors.toList());*/

        List<ADDStockModel> stockList = stocksRepository.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDStockModel> existing = addStockRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDStockModel exist = existing.get();
                exist.setProductId(proj.getProductId());
                exist.setQuantity(proj.getQuantity());
                exist.setMinStock(proj.getMinStock());
                exist.setMaxStock(proj.getMaxStock());
                return exist;
            } else {
                return ADDStockModel.builder()
                        .id(proj.getId())
                        .productId(proj.getProductId())
                        .quantity(proj.getQuantity())
                        .minStock(proj.getMinStock())
                        .maxStock(proj.getMaxStock())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDTransactions_1Model> transactions1List = transactionsRepository.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDTransactions_1Model> existing = addTransactions1Repository.findById(proj.getTransactionId());
            if (existing.isPresent()) {
                ADDTransactions_1Model exist = existing.get();
                exist.setTransactionDatetime(proj.getTransactionDatetime());
                exist.setDebitAccountId(proj.getDebitAccountId());
                exist.setCreditBankName(proj.getCreditBankName());
                exist.setAuthenticationType(proj.getAuthenticationType());
                exist.setTransferredAmount(proj.getTransferredAmount());
                exist.setNewDebitAccountState(proj.getNewDebitAccountState());
                exist.setAgeAtRequest(proj.getAgeAtRequest());
                return exist;
            } else {
                return ADDTransactions_1Model.builder()
                        .Id(proj.getTransactionId())
                        .transactionDatetime(proj.getTransactionDatetime())
                        .debitAccountId(proj.getDebitAccountId())
                        .creditBankName(proj.getCreditBankName())
                        .authenticationType(proj.getAuthenticationType())
                        .transferredAmount(proj.getTransferredAmount())
                        .newDebitAccountState(proj.getNewDebitAccountState())
                        .ageAtRequest(proj.getAgeAtRequest())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDTransactions_2Model> transactions2List = transactionsRepository2.findAllProjectedBy().stream().map(proj -> {
            Optional<ADDTransactions_2Model> existing = addTransactions2Repository.findById(proj.getTransactionId());
            if (existing.isPresent()) {
                ADDTransactions_2Model exist = existing.get();
                exist.setTransactionDatetime(proj.getTransactionDatetime());
                exist.setDebitAccountId(proj.getDebitAccountId());
                exist.setCreditBankName(proj.getCreditBankName());
                exist.setAuthenticationType(proj.getAuthenticationType());
                exist.setTransferredAmount(proj.getTransferredAmount());
                exist.setNewDebitAccountState(proj.getNewDebitAccountState());
                exist.setAgeAtRequest(proj.getAgeAtRequest());
                return exist;
            } else {
                return ADDTransactions_2Model.builder()
                        .Id(proj.getTransactionId())
                        .transactionDatetime(proj.getTransactionDatetime())
                        .debitAccountId(proj.getDebitAccountId())
                        .creditBankName(proj.getCreditBankName())
                        .authenticationType(proj.getAuthenticationType())
                        .transferredAmount(proj.getTransferredAmount())
                        .newDebitAccountState(proj.getNewDebitAccountState())
                        .ageAtRequest(proj.getAgeAtRequest())
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDUsersModel> users = usersModels.stream().map(proj -> {
            Integer addressIdObj = proj.getAddressId();
            int addressId = (addressIdObj != null) ? addressIdObj : 0; // ou une autre valeur par défaut si tu préfères

            Double monthlySalaryObj = proj.getMonthlySalary();
            double monthlySalary = (monthlySalaryObj != null) ? monthlySalaryObj : 0.0; // pareil ici

            Optional<ADDUsersModel> existing = addUsersRepository.findById(proj.getId());
            if (existing.isPresent()) {
                ADDUsersModel exist = existing.get();
                exist.setAddressId(addressId);
                exist.setRegistrationDate(proj.getRegistrationDate());
                exist.setGender(proj.getGender());
                exist.setBirthDate(proj.getBirthDate());
                exist.setMaritalStatus(proj.getMaritalStatus());
                exist.setMonthlySalary(monthlySalary);
                return exist;
            } else {
                return ADDUsersModel.builder()
                        .id(proj.getId())
                        .addressId(addressId)
                        .registrationDate(proj.getRegistrationDate())
                        .gender(proj.getGender())
                        .birthDate(proj.getBirthDate())
                        .maritalStatus(proj.getMaritalStatus())
                        .monthlySalary(monthlySalary)
                        .build();
            }
        }).collect(Collectors.toList());

        List<ADDClientsModel> clients = clientsModels.stream().map(proj -> {
            ObjectId id = proj.getId();  // C'est bien un ObjectId

            // On vérifie si l'objet existe déjà dans la base de destination
            Optional<ADDClientsModel> existing = addClientsRepository.findById(id);
            if (existing.isPresent()) {
                ADDClientsModel exist = existing.get();
                exist.setAgeAtRequest(proj.getAgeAtRequest());
                exist.setRequestDateTime(proj.getRequestDateTime());
                return exist;
            } else {
                return ADDClientsModel.builder()
                        .id(id)
                        .ageAtRequest(proj.getAgeAtRequest())
                        .birthDate(proj.getBirthDate())
                        .gender(String.valueOf(proj.getGender()))
                        .requestDateTime(proj.getRequestDateTime())
                        .build();
            }
        }).collect(Collectors.toList());

        // Sauvegarde dans les bases de données
        addAccounts1Repository.saveAll(comptes);  // Sauvegarde des comptes de Bank 1
        addAccounts1Repository.flush();

        addAccounts2Repository.saveAll(comptes2);  // Sauvegarde des comptes de Bank 2
        addAccounts2Repository.flush();

        addAdressesRepository.saveAll(adresses);  // Sauvegarde des adresses
        addAdressesRepository.flush();

        addCategoriesRepository.saveAll(categories);  // Sauvegarde des catégories
        addCategoriesRepository.flush();

        addClients1Repository.saveAll(bankClients1);  // Sauvegarde des clients de Bank 1
        addClients1Repository.flush();

        addClients2Repository.saveAll(bankClients2);  // Sauvegarde des clients de Bank 2
        addClients2Repository.flush();

        addExternalTransactions1Repository.saveAll(externalTransactions1);  // Sauvegarde des transactions externes de Bank 1
        addExternalTransactions1Repository.flush();

        addExternalTransactions2Repository.saveAll(externalTransactions2);  // Sauvegarde des transactions externes de Bank 2
        addExternalTransactions2Repository.flush();

        addOrderLinesRepository.saveAll(orderLines);  // Sauvegarde des lignes de commande
        addOrderLinesRepository.flush();

        addOrdersRepository.saveAll(orders);  // Sauvegarde des commandes
        addOrdersRepository.flush();

        addPaymentsRepository.saveAll(payments);  // Sauvegarde des paiements
        addPaymentsRepository.flush();

        addProductsRepository.saveAll(products);  // Sauvegarde des produits
        addProductsRepository.flush();

        addStockRepository.saveAll(stockList);  // Sauvegarde des stocks
        addStockRepository.flush();

        addTransactions1Repository.saveAll(transactions1List);  // Sauvegarde des transactions de Bank 1
        addTransactions1Repository.flush();

        addTransactions2Repository.saveAll(transactions2List);  // Sauvegarde des transactions de Bank 2
        addTransactions2Repository.flush();

        addUsersRepository.saveAll(users);  // Sauvegarde des utilisateurs
        addUsersRepository.flush();

        //addChatRepository.saveAll(chats);// Sauvegarde des chats
        //addChatRepository.flush();
        //addCommentsRepository.saveAll(comments);// Sauvegarde des commentaires
//        addCommentsRepository.flush();
        //addDeliveryTrackingRepository.saveAll(deliveryTrackings);// Sauvegarde du suivi des livraisons
//        addDeliveryTrackingRepository.flush();
        //addSavRepository.saveAll(savList);// Sauvegarde des demandes SAV
//        addSavRepository.flush();


        this.upsertClients(clients);


        System.out.println("Adding done");

    }

    @Autowired
    @Qualifier("bddestinationMongoTemplate")
    private MongoTemplate mongoTemplate;


    public void upsertClients(List<ADDClientsModel> clientsModels) {
        BulkOperations bulkOps = mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, ADDClientsModel.class);

        for (ADDClientsModel proj : clientsModels) {
            // Ici on crée un Query qui match par l'id
            Query query = new Query(Criteria.where("_id").is(proj.getId()));

            // Et on prépare l'update
            Update update = new Update()
                    .set("ageAtRequest", proj.getAgeAtRequest())
                    .set("birthDate", proj.getBirthDate())
                    .set("gender", proj.getGender())
                    .set("requestDateTime", proj.getRequestDateTime());

            // Puis on ajoute à bulk
            bulkOps.upsert(query, update);
        }

        // Et on exécute toutes les opérations en une seule fois
        bulkOps.execute();
    }




}
