package com.fintech.dao;

import com.fintech.DBUtil;
import com.fintech.model.Product;

import java.sql.*;
import java.util.*;

public class ProductDAO {

    public static List<Product> getProducts() throws Exception {

        List<Product> list = new ArrayList<>();

        Connection con = DBUtil.getConnection();
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM products");

        while (rs.next()) {
            list.add(new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("price")
            ));
        }

        con.close();
        return list;
    }

    public static void addProduct(String name, double price) throws Exception {

        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO products(name, price) VALUES (?, ?)"
        );

        ps.setString(1, name);
        ps.setDouble(2, price);
        ps.executeUpdate();

        con.close();
    }
}
