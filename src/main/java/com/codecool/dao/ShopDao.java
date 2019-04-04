package com.codecool.dao;

import com.codecool.model.Shop;

import java.sql.SQLException;
import java.util.List;

public interface ShopDao {

    List<Shop> findAll() throws SQLException;

    List<Shop> findAllByCouponId(int couponId) throws SQLException;

    Shop findById(int id) throws SQLException;

    Shop add(String name) throws SQLException;
}
