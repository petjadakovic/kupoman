package org.kupoman.KupomanRest.shop;

import java.util.List;

public class ShopService {

    private final ShopMapper shopMapper;

    public ShopService() {
        this.shopMapper = new ShopMapper();
    }

    public List<Shop> getShops() {
        return shopMapper.mapToModelList(ShopRepository.getShops());
    }

}
