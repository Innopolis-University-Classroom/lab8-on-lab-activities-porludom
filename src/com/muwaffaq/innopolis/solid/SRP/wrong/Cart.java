package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

import java.util.List;

/**
 * ❌ ❌ ❌ ❌
 * how many responsibilities does it have? 3
 *
 * SRP :
 * a class should only have one responsibility
 * it should only have one reason to change
 */

public class Cart {

    List<Product> products;
    double totals;
    String token;

    void addToCart(Product product) {
        products.add(product);
    }

    void removeFromCart(Product product) {
        products.remove(product);
    }
}

public class ProductManager{
    public void addToCart(Cart cart, Product product){
        cart.products.add(product);
    }
    public void removeFromCart(Cart cart, Product product){
        cart.products.remove(product);
    }
}

public class DiscountManager{
    public void applyDiscount(Cart cart, int per){
        cart.totals = totals * per;
    }
}



