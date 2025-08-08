package com.virtual_thread.service;

import com.virtual_thread.model.Transfer;
import com.virtual_thread.repository.TransferRepo;
import com.virtual_thread.utils.CsvReportUtil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TransferService {
    @Autowired
    private TransferRepo transferRepo;

    public void getTransfer(String title) {
        log.info("generating report for title: {} | {}", title, Thread.currentThread());

        try {
            List<Transfer> list = transferRepo.findByTitle(title);

            CsvReportUtil.writeCustomersToCsv("simple_" + title, list);
         
        } catch (Exception e) {
              System.out.println("❌ Error writing report for title: " + title);
        }

    }

}
