package com.mdsr.InvoiceManagementBackend.controller.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    public List<Invoice> getAllInvoice(){
        List<Invoice> invoices = new ArrayList<>();
        invoiceRepository.findAll().forEach(invoices::add);
        return invoices;
    }

    public Invoice getInvoice(Long id) {
        return  invoiceRepository.findById(id).get();
    }

    public void addInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void updateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }
}
