package com.mdsr.InvoiceManagementBackend.controller.Invoice;

import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
