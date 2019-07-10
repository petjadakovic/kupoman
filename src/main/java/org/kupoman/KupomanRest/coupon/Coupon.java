package org.kupoman.KupomanRest.coupon;

import java.io.Serializable;

import org.kupoman.KupomanRest.shop.Shop;
import lombok.Data;

/**
 * Model kupona cemo koristiti kao jedinicu transporta informacija
 * izmedju BE i FE. Potencijalno bi ga koristili i za medjuservisnu 
 * komunikaciju.
 * 
 * Upotrebljena je biblioteka lombok koja naravno nije obavezna.
 * Ovde demonstriram kako ce se sa @Data generisati svi adekvatni:
 * Geteri (Moze se postici sa @Getters)
 * Seteri (Moze se postici sa @Setters)
 * Prazan konstruktor (Moze se postici sa @NoArgsConstructor)
 * ToString metoda (Moze se postici sa @ToString).
 * 
 * Obratite paznju da ova klasa ima referencu na instancu Shop.
 * Ova instanca, ako je prisutna, ce takodje biti serijalizovana
 * u JSON od strane json-moxy.
 */
@Data
public class Coupon implements Serializable{
	
	private static final long serialVersionUID = 7981293420196482847L;
	private Long id;
	private Shop shop;
	private String productName;
	private Float newPrice;
	private Float oldPrice;
	private Float discount;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
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

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}
}
