package com.accp.bill.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.bill.dao.IBill;
import com.accp.bill.pojo.Tb_bill;
import com.accp.bill.pojo.Tb_detail;

@Service
public class BillBiz {
	
	@Autowired
	private IBill billDao;
	
	/**
	 * 新增
	 * @param bill
	 */
	public int addBill(Tb_bill bill) {
		return billDao.saveBill(bill);
	}
	
	/**
	 * 根据ID查询
	 * @param billno
	 */
	public List<Tb_detail> queryByID(String billno) {
		return billDao.queryById(billno);
	}
	
	public List<Tb_bill> queryByBillId(String billno){
		return billDao.queryByBillId(billno);
	}
	
	public int updateBill(Tb_bill bill) {
		return billDao.updateBill(bill);
	}
}
