package com.virtual_thread.utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.virtual_thread.model.Transfer;

public class CsvReportUtil {
 public static void writeCustomersToCsv(String region, List<Transfer> customers) throws IOException {
        Path path = Paths.get("reports", region + "_report.csv");
        Files.createDirectories(path.getParent());

        try (BufferedWriter writer = Files.newBufferedWriter(path);
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                     .withHeader("ID", "TrnRef", "Account","TxnDate", "Title"))) {

            for (Transfer customer : customers) {
                csvPrinter.printRecord(customer.getId(), customer.getTrnRefNo(), customer.getSourceAccountNo(),customer.getTxnDate(), customer.getTitle());
            }
        }
    }
}
