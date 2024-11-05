package uk.co.hackajob.interview.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductServiceTest {

    private static final String FIRST_PRODUCT = "6447344";

    private static final String SECOND_PRODUCT = "3052068";

    private static ProductService productService;

    @BeforeAll
    static void beforeAll() {
        productService = new ProductService();
    }

    // TODO: Unit test me :)

}
