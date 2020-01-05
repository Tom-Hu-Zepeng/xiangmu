package com.accp.bill.pojo;

public class Tb_detail {
	private int lineid;		//行号
	private String billno;	//入库单单号
	private String goodsname;	//商品名称
	private int goodsnum;		// 数量
	private int goodsprice;		//单价
	private int goodsmoneyamt;	//金额
	private int ispresent;		//是否赠品
	
	@Override
	public String toString() {
		return "Tb_detail [lineid=" + lineid + ", billno=" + billno + ", goodsname=" + goodsname + ", goodsnum="
				+ goodsnum + ", goodsprice=" + goodsprice + ", goodsmoneyamt=" + goodsmoneyamt + ", ispresent="
				+ ispresent + "]";
	}

	public Tb_detail(int lineid, String billno, String goodsname, int goodsnum, int goodsprice, int goodsmoneyamt,
			int ispresent) {
		super();
		this.lineid = lineid;
		this.billno = billno;
		this.goodsname = goodsname;
		this.goodsnum = goodsnum;
		this.goodsprice = goodsprice;
		this.goodsmoneyamt = goodsmoneyamt;
		this.ispresent = ispresent;
	}

	public Tb_detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getLineid() {
		return lineid;
	}
	public void setLineid(int lineid) {
		this.lineid = lineid;
	}
	public String getBillno() {
		return billno;
	}
	public void setBillno(String billno) {
		this.billno = billno;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public int getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(int goodsnum) {
		this.goodsnum = goodsnum;
	}
	public int getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(int goodsprice) {
		this.goodsprice = goodsprice;
	}
	public int getGoodsmoneyamt() {
		return goodsmoneyamt;
	}
	public void setGoodsmoneyamt(int goodsmoneyamt) {
		this.goodsmoneyamt = goodsmoneyamt;
	}
	public int getIspresent() {
		return ispresent;
	}
	public void setIspresent(int ispresent) {
		this.ispresent = ispresent;
	}
}
