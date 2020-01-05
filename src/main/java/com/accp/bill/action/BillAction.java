package com.accp.bill.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.bill.biz.BillBiz;
import com.accp.bill.pojo.Tb_bill;

@Controller
@RequestMapping("/api/bill")			//命名空间
public class BillAction {
	
	@Autowired
	private BillBiz billBiz;
	
	@PostMapping("add1")
	@ResponseBody
	public Map<String, String> addBill(@RequestBody Tb_bill bill){
		String billno=bill.getBillno();
		List<Tb_bill> list=billBiz.queryByBillId(billno);
		if(list.size()>0) {
			billBiz.updateBill(bill);
		}else {
			billBiz.addBill(bill);
		}
		Map<String, String> mssg = new HashMap<String, String>();
		mssg.put("code", "200");
		mssg.put("mssg", "ok");
		return mssg;
	}
	
	@GetMapping("queryById")
	@ResponseBody
	public List<Tb_bill> addBill(String id){
		System.out.println("建立饿了"+id);
		return billBiz.queryByBillId(id);
	}
}
