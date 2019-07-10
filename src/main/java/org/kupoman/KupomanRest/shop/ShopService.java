package org.kupoman.KupomanRest.shop;

import java.sql.SQLException;
import java.util.List;

public class ShopService {

    private final ShopMapper shopMapper;

    public ShopService() {
        this.shopMapper = new ShopMapper();
    }

    public List<Shop> getShops() {
        try {
			return shopMapper.mapToModelList(ShopRepository.getShops());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }

}
