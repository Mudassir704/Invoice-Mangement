package com.mdsr.InvoiceManagementBackend.controller.Invoice;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final InvoiceRepository invoiceRepository;

    @Autowired
    public DatabaseLoader(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public void run(String... args) throws IOException, CsvException {
        String fileName = "C:\\Users\\mdmud\\Desktop\\InvoiceManagement\\InvoiceManagementBackend\\src\\main\\resources\\dataset.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
                for(String[] s: r) {
//                String[] s = r.get(i);
                if (!Objects.equals(s[0], "business_code")) {
                    this.invoiceRepository.save(new Invoice(s[17], s[2],  s[14]));
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
