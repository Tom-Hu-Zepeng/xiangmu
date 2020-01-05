package com.accp.bill.pojo;

import java.util.Date;
import java.util.List;

public class Tb_bill {

	private String billno;		//单号
	private Date billdate;		//单据日期
	private String suppliername;		//供应商
	private String supplieraddress;		//供应商地址
	private String department;			//采购业务部
	private String warehouse;			//仓库
	private String buyer;				//采购人员
	private String executor;			//制单人员
	
	private List<Tb_detail> detail;
	
	

	@Override
	public String toString() {
		return "Tb_bill [billno=" + billno + ", billdate=" + billdate + ", suppliername=" + suppliername
				+ ", supplieraddress=" + supplieraddress + ", department=" + department + ", warehouse=" + warehouse
				+ ", buyer=" + buyer + ", executor=" + executor + ", detail=" + detail + "]";
	}

	public Tb_bill(String billno, Date billdate, String suppliername, String supplieraddress, String department,
			String warehouse, String buyer, String executor, List<Tb_detail> detail) {
		super();
		this.billno = billno;
		this.billdate = billdate;
		this.suppliername = suppliername;
		this.supplieraddress = supplieraddress;
		this.department = department;
		this.warehouse = warehouse;
		this.buyer = buyer;
		this.executor = executor;
		this.detail = detail;
	}

	public Tb_bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBillno() {
		return billno;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}

	public Date getBilldate() {
		return billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getSupplieraddress() {
		return supplieraddress;
	}

	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public List<Tb_detail> getDetail() {
		return detail;
	}

	public void setDetail(List<Tb_detail> detail) {
		this.detail = detail;
	}
}
