package com.mdsr.InvoiceManagementBackend.controller.Invoice;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class InvoiceController {

    private final InvoiceService invoicesService;

    public InvoiceController(InvoiceService invoicesService) {
        this.invoicesService = invoicesService;
    }

    @RequestMapping("/invoices")
    public List<Invoice>  getAllInvoice(){
        return invoicesService.getAllInvoice();
    }

    @RequestMapping("/invoices/{id}")
    public Invoice getInvoice(@PathVariable Long id){
        return invoicesService.getInvoice(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/invoices")
    public void addInvoice(@RequestBody Invoice invoice){
        invoicesService.addInvoice(invoice);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/invoices/{id}")
    public void updateInvoice(@RequestBody Invoice invoice){
        invoicesService.updateInvoice(invoice);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/invoices/{id}")
    public void deleteInvoice(@PathVariable Long id){
        invoicesService.deleteInvoice(id);
    }
}
