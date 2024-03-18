package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Purchase_Order {

	private String Document_Name;
	private String Document_Type;
	@Id
	private Long Purchase_Order_Number;
	private String Supplier_Name;
	private Date Order_Date;
	private Date Delivery_Date;
	private String Item_Description;
	private  String Quantity;
	private String Unit_Price;
	private String Total_Amount;
	private String Shipping_Instructions;
	public String getDocument_Name() {
		return Document_Name;
	}
	public void setDocument_Name(String document_Name) {
		Document_Name = document_Name;
	}
	public String getDocument_Type() {
		return Document_Type;
	}
	public void setDocument_Type(String document_Type) {
		Document_Type = document_Type;
	}
	public Long getPurchase_Order_Number() {
		return Purchase_Order_Number;
	}
	public void setPurchase_Order_Number(Long purchase_Order_Number) {
		Purchase_Order_Number = purchase_Order_Number;
	}
	public String getSupplier_Name() {
		return Supplier_Name;
	}
	public void setSupplier_Name(String supplier_Name) {
		Supplier_Name = supplier_Name;
	}
	public Date getOrder_Date() {
		return Order_Date;
	}
	public void setOrder_Date(Date order_Date) {
		Order_Date = order_Date;
	}
	public Date getDelivery_Date() {
		return Delivery_Date;
	}
	public void setDelivery_Date(Date delivery_Date) {
		Delivery_Date = delivery_Date;
	}
	public String getItem_Description() {
		return Item_Description;
	}
	public void setItem_Description(String item_Description) {
		Item_Description = item_Description;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getUnit_Price() {
		return Unit_Price;
	}
	public void setUnit_Price(String unit_Price) {
		Unit_Price = unit_Price;
	}
	public String getTotal_Amount() {
		return Total_Amount;
	}
	public void setTotal_Amount(String total_Amount) {
		Total_Amount = total_Amount;
	}
	public String getShipping_Instructions() {
		return Shipping_Instructions;
	}
	public void setShipping_Instructions(String shipping_Instructions) {
		Shipping_Instructions = shipping_Instructions;
	}
	public Purchase_Order(String document_Name, String document_Type, Long purchase_Order_Number, String supplier_Name,
			Date order_Date, Date delivery_Date, String item_Description, String quantity, String unit_Price,
			String total_Amount, String shipping_Instructions) {
		super();
		Document_Name = document_Name;
		Document_Type = document_Type;
		Purchase_Order_Number = purchase_Order_Number;
		Supplier_Name = supplier_Name;
		Order_Date = order_Date;
		Delivery_Date = delivery_Date;
		Item_Description = item_Description;
		Quantity = quantity;
		Unit_Price = unit_Price;
		Total_Amount = total_Amount;
		Shipping_Instructions = shipping_Instructions;
	}
	public Purchase_Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Purchase_Order [Document_Name=" + Document_Name + ", Document_Type=" + Document_Type
				+ ", Purchase_Order_Number=" + Purchase_Order_Number + ", Supplier_Name=" + Supplier_Name
				+ ", Order_Date=" + Order_Date + ", Delivery_Date=" + Delivery_Date + ", Item_Description="
				+ Item_Description + ", Quantity=" + Quantity + ", Unit_Price=" + Unit_Price + ", Total_Amount="
				+ Total_Amount + ", Shipping_Instructions=" + Shipping_Instructions + "]";
	}
	
	
	
}
