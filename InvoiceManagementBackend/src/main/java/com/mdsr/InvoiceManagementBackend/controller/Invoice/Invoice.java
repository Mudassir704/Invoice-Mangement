package com.mdsr.InvoiceManagementBackend.controller.Invoice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {
    private @Id @GeneratedValue Long id;
//    private String businessCode, number,invoiceCurrency, clearDate, businessYear, docId, postingDate, documentCreateDate,dueInDate, postingId, custPaymentTerms, isOpen;
    private String invoiceId, name, totalOpenAmount;

    public Invoice() {}

//    public Invoice(String businessCode, String invoiceId, String name, String number, String invoiceCurrency, String clearDate, String businessYear, String docId, String postingDate, String documentCreateDate, String dueInDate, String postingId, String totalOpenAmount, String custPaymentTerms, String isOpen) {
//        this.businessCode = businessCode;
//        this.invoiceId = invoiceId;
//        this.name = name;
//        this.number = number;
//        this.invoiceCurrency = invoiceCurrency;
//        this.clearDate = clearDate;
//        this.businessYear = businessYear;
//        this.docId = docId;
//        this.postingDate = postingDate;
//        this.documentCreateDate = documentCreateDate;
//        this.dueInDate = dueInDate;
//        this.postingId = postingId;
//        this.totalOpenAmount = totalOpenAmount;
//        this.custPaymentTerms = custPaymentTerms;
//        this.isOpen = isOpen;
//    }


    public Invoice(String invoiceId, String name, String totalOpenAmount) {
        this.invoiceId = invoiceId;
        this.name = name;
        this.totalOpenAmount = totalOpenAmount;
    }

//    @Override
//    public String toString() {
//        return "Invoice{" +
//                "id=" + id +
//                ", businessCode='" + businessCode + '\'' +
//                ", invoiceId='" + invoiceId + '\'' +
//                ", name='" + name + '\'' +
//                ", number='" + number + '\'' +
//                ", invoiceCurrency='" + invoiceCurrency + '\'' +
//                ", clearDate='" + clearDate + '\'' +
//                ", businessYear='" + businessYear + '\'' +
//                ", docId='" + docId + '\'' +
//                ", postingDate='" + postingDate + '\'' +
//                ", documentCreateDate='" + documentCreateDate + '\'' +
//                ", dueInDate='" + dueInDate + '\'' +
//                ", postingId='" + postingId + '\'' +
//                ", totalOpenAmount='" + totalOpenAmount + '\'' +
//                ", custPaymentTerms='" + custPaymentTerms + '\'' +
//                ", isOpen='" + isOpen + '\'' +
//                '}';
//    }

//    public String getBusinessCode() {
//        return businessCode;
//    }

//    public void setBusinessCode(String businessCode) {
//        this.businessCode = businessCode;
//    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

//    public String getInvoiceCurrency() {
//        return invoiceCurrency;
//    }
//
//    public void setInvoiceCurrency(String invoiceCurrency) {
//        this.invoiceCurrency = invoiceCurrency;
//    }
//
//    public String getClearDate() {
//        return clearDate;
//    }
//
//    public void setClearDate(String clearDate) {
//        this.clearDate = clearDate;
//    }
//
//    public String getBusinessYear() {
//        return businessYear;
//    }
//
//    public void setBusinessYear(String businessYear) {
//        this.businessYear = businessYear;
//    }
//
//    public String getDocId() {
//        return docId;
//    }
//
//    public void setDocId(String docId) {
//        this.docId = docId;
//    }
//
//    public String getPostingDate() {
//        return postingDate;
//    }
//
//    public void setPostingDate(String postingDate) {
//        this.postingDate = postingDate;
//    }
//
//    public String getDocumentCreateDate() {
//        return documentCreateDate;
//    }
//
//    public void setDocumentCreateDate(String documentCreateDate) {
//        this.documentCreateDate = documentCreateDate;
//    }
//
//    public String getDueInDate() {
//        return dueInDate;
//    }
//
//    public void setDueInDate(String dueInDate) {
//        this.dueInDate = dueInDate;
//    }
//
//    public String getPostingId() {
//        return postingId;
//    }
//
//    public void setPostingId(String postingId) {
//        this.postingId = postingId;
//    }

    public String getTotalOpenAmount() {
        return totalOpenAmount;
    }

    public void setTotalOpenAmount(String totalOpenAmount) {
        this.totalOpenAmount = totalOpenAmount;
    }

//    public String getCustPaymentTerms() {
//        return custPaymentTerms;
//    }
//
//    public void setCustPaymentTerms(String custPaymentTerms) {
//        this.custPaymentTerms = custPaymentTerms;
//    }
//
//    public String getIsOpen() {
//        return isOpen;
//    }
//
//    public void setIsOpen(String isOpen) {
//        this.isOpen = isOpen;
//    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

//    public String getNumber() { return number; }
//
//    public void setNumber(String number) { this.number = number; }
}
