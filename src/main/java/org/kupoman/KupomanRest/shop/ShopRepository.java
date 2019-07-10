package org.kupoman.KupomanRest.shop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kupoman.KupomanRest.repository.MySQLConnection;

import java.sql.Statement;

public class ShopRepository {

    private static List<ShopEntity> SHOP_LIST;

    static {
        SHOP_LIST = generateShops();
    }

    private static List<ShopEntity> generateShops() {
        List<ShopEntity> shops = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            ShopEntity shopEntity = new ShopEntity();
            shopEntity.setId((long) i);
            shopEntity.setName("Shop " + i);
            shops.add(shopEntity);
        }
        return shops;
    }

    public synchronized static List<ShopEntity> getShops() throws SQLException {
    	System.out.println("Helllo");
    	Connection connection = MySQLConnection.getDBConnection();
    	Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("select * from shops");
    	List<ShopEntity> shopList = new ArrayList<ShopEntity>();
    	while(rs.next()) {
    		ShopEntity shop = new ShopEntity();
    		shop.setId(rs.getLong("id"));
    		shop.setName(rs.getString("name"));
    		shopList.add(shop);
    	}
        return shopList;
    }

    public synchronized static ShopEntity getShopById(Long index) {
        return SHOP_LIST.get(Math.toIntExact(index));
    }

}
