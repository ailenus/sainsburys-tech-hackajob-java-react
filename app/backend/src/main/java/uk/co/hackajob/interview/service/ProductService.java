package uk.co.hackajob.interview.service;

import uk.co.hackajob.interview.entity.Product;

public class ProductService {

    /**
     * There is a JSON file product.json with all the products available. This service will accept the product uid in
     * as parameter, and it will return all the details about the product received.
     */
    public Product get(String uid) {
        return new Product();
    }

}
