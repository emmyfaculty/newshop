package com.example.newshop.dao;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TransDaoImplTest {
    /**
     * Method under test: {@link TransDaoImpl#getUserId(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.example.newshop.dao.TransDaoImpl.getUserId(TransDaoImpl.java:22)
        //   In order to prevent getUserId(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getUserId(String).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new TransDaoImpl()).getUserId("42");
    }
}

