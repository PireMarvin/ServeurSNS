package com.example.sns.service;

import com.example.sns.dto.DataModel;
import com.example.sns.repository.DataRepository;
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

    public void processAndStoreData(List<DataModel> data) {
        for (DataModel item : data) {
            // Traitement des données (extraction des valeurs nécessaires)
            dataRepository.save(item);
        }
    }
}
