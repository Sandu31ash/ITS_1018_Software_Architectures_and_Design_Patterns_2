package lk.ijse.ad2cwuserservice.dto;

import java.io.Serializable;

public class ItemDTO implements Serializable {
    private String itemCode;
    private double unitPrice;
    private int qty;

    public ItemDTO(String itemCode, double unitPrice, int qty) {
        this.itemCode = itemCode;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public String getItemCode() {
        return itemCode;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public ItemDTO() {
    }
}
