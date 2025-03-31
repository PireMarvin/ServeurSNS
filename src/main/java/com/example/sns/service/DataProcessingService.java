package com.example.sns.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DataProcessingService {
    private final DataRepository dataRepository;

    public DataProcessingService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<DataModel> getAllData() {
        return dataRepository.findAll();
    }

}
