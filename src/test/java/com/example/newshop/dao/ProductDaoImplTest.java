package com.example.newshop.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.newshop.beans.ProductBean;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ProductDaoImplTest {

    @Test
    void testUpdateProduct2() {
        // Arrange
        ProductDaoImpl productDaoImpl = new ProductDaoImpl();

        ProductBean productBean = new ProductBean();
        productBean.setProdId("42");

        // Act and Assert
        assertEquals("Both Products are Different, Updation Failed!",
                productDaoImpl.updateProduct(productBean, new ProductBean()));
    }


    @Test
    void testUpdateProductWithoutImage() {
        // Arrange
        ProductDaoImpl productDaoImpl = new ProductDaoImpl();

        // Act and Assert
        assertEquals("Both Products are Different, Update Failed!",
                productDaoImpl.updateProductWithoutImage("42", new ProductBean()));
    }


}

