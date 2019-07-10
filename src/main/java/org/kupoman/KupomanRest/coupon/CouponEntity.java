package org.kupoman.KupomanRest.coupon;

import org.kupoman.KupomanRest.shop.ShopEntity;
import lombok.Data;

/**
 * Model kupona cemo koristiti kao jedinicu transporta informacija
 * izmedju Web Aplikacije i Baze.
 *
 * Podaci iz baze (MySQL, Mongo, Text fajl) ce se mapirati na polja
 * instance ove klase ako su vezani za ovaj domen (Kupon).
 */
@Data
public class CouponEntity {

    private Long id;
    private ShopEntity shop;
    private String productName;
    private Float newPrice;
    private Float oldPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Float newPrice) {
        this.newPrice = newPrice;
    }

    public Float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Float oldPrice) {
        this.oldPrice = oldPrice;
    }
}
