package com.accp.bill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.bill.pojo.Tb_bill;
import com.accp.bill.pojo.Tb_detail;

public interface IBill {

	/**
	 * 主项新增
	 * @param bill
	 */
	public int saveBill(@Param("bill") Tb_bill bill);
	
	
	/**
	 * 根据ID查询
	 */
	public List<Tb_detail> queryById(@Param("billno") String billno);
	
	
	/**
	 * 根据订单编号查询
	 * @param billno
	 * @return
	 */
	public List<Tb_bill> queryByBillId(@Param("billno") String billno);
	
	/**
	 * 修改
	 * @param bill
	 * @return
	 */
	public int updateBill(@Param("bill") Tb_bill bill);
}
