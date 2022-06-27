package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(1000),2,new BigDecimal(2000));
        Item item2 = new Item(new BigDecimal(2000),5, new BigDecimal(10000));
        Item item3 = new Item(new BigDecimal(100),10, new BigDecimal(1000));
        Product product = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        item.setProduct(product);
        item2.setProduct(product2);
        item3.setProduct(product3);
        Invoice invoice = new Invoice();
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}
