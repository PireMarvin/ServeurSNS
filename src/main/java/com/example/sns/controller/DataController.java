package com.example.sns.controller;

import com.example.sns.dto.DataModel;
import com.example.sns.service.DataProcessingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {
    private final DataProcessingService dataProcessingService;

    public DataController(DataProcessingService dataProcessingService) {
        this.dataProcessingService = dataProcessingService;
    }

    @GetMapping
    public List<DataModel> getAllData() {
        return dataProcessingService.getAllData();
    }

    @PostMapping
    public void processData(@RequestBody List<DataModel> data) {
        dataProcessingService.processAndStoreData(data);
    }
}
