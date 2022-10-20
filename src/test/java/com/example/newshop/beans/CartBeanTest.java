package com.example.newshop.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CartBeanTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CartBean#CartBean()}
     *   <li>{@link CartBean#setProdId(String)}
     *   <li>{@link CartBean#setQuantity(int)}
     *   <li>{@link CartBean#setUserId(String)}
     *   <li>{@link CartBean#getProdId()}
     *   <li>{@link CartBean#getQuantity()}
     *   <li>{@link CartBean#getUserId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange and Act
        CartBean actualCartBean = new CartBean();
        actualCartBean.setProdId("42");
        actualCartBean.setQuantity(1);
        actualCartBean.setUserId("42");

        // Assert
        assertEquals("42", actualCartBean.getProdId());
        assertEquals(1, actualCartBean.getQuantity());
        assertEquals("42", actualCartBean.getUserId());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CartBean#CartBean(String, String, int)}
     *   <li>{@link CartBean#setProdId(String)}
     *   <li>{@link CartBean#setQuantity(int)}
     *   <li>{@link CartBean#setUserId(String)}
     *   <li>{@link CartBean#getProdId()}
     *   <li>{@link CartBean#getQuantity()}
     *   <li>{@link CartBean#getUserId()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        // Arrange and Act
        CartBean actualCartBean = new CartBean("42", "42", 1);
        actualCartBean.setProdId("42");
        actualCartBean.setQuantity(1);
        actualCartBean.setUserId("42");

        // Assert
        assertEquals("42", actualCartBean.getProdId());
        assertEquals(1, actualCartBean.getQuantity());
        assertEquals("42", actualCartBean.getUserId());
    }
}

