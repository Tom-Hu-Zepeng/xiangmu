package com.accp.test;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.JsonExpectationsHelper;

import com.accp.bill.biz.BillBiz;
import com.accp.bill.pojo.Tb_bill;
import com.accp.bill.pojo.Tb_detail;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/spring-ctx.xml"})
public class BizTest {
	
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-hh");
	
	@Resource
	private BillBiz biz;
	
	@Test
	public void text() {
		List<Tb_bill> list=biz.queryByBillId("2019113001");
		System.out.println(JSON.toJSONString(list));
		for (Tb_bill tb_bill : list) {
			System.out.println(tb_bill.getDetail());
		}
	}
	
	@Test
	public void testBiz() {
		Tb_bill bill=new Tb_bill();
		bill.setBillno("2019113005");
		bill.setSuppliername("株洲百货");
		bill.setSupplieraddress("株洲");
		bill.setDepartment("采购部");
		bill.setWarehouse("五号");
		bill.setBuyer("Tom");
		bill.setExecutor("summer");
		List<Tb_detail> list=new ArrayList<Tb_detail>();
		Tb_detail tb=new Tb_detail();
		tb.setBillno("2019113005");
		tb.setGoodsname("怡宝矿泉水");
		tb.setGoodsnum(20);
		tb.setGoodsprice(5);
		tb.setGoodsmoneyamt(100);
		tb.setIspresent(1);
		list.add(tb);
		bill.setDetail(list);
		try {
			bill.setBilldate(sim.parse("2019-12-2 09:52:41"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int a=biz.updateBill(bill);
		if(a>0) {
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}
	}
}
