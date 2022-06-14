package com.codegym.service;
import com.codegym.model.Product;

import javax.swing.plaf.basic.BasicListUI;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

public class ProductService implements IProductService{
    public static List<Product> products ;
    public static int id = 1;
    static {
        products = new ArrayList<>();
        products.add(new Product(id++,"Oppo reno7","China",500));
        products.add(new Product(id++,"iphoneXS","America",900));
        products.add(new Product(id++,"XiaoMi 12 pro","China",300));
        products.add(new Product(id++,"Sony a 6300","Japan",650));
        products.add(new Product(id++,"SamSung s22","Korea",2700));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }


    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.get(id).setMade(product.getMade());
        products.get(id).setName(product.getName());
        products.get(id).setPrice(product.getPrice());
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }


    }
