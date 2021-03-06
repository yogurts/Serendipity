package com.Model;

import java.sql.*;

import com.Core.DBOracle;

public class StockBeanCl {
	
	private java.sql.Statement sm=null;
	private ResultSet rs=null;
	private Connection conn=null;
	private String stockName=null;
	DBOracle dbo =  new DBOracle();
	
	//验证股票名称是否存在
	public String checkStockName(String tradeDate){

		try {
			
			//到数据库中去验证
			//conn=new ConnDB().getConn();
			conn = dbo.getConn();
			//创建Statement
			sm=conn.createStatement();
			
			//查询
			
			String sql = "select STOCK_NAME from ita.tb_stock t where TRADE_DATE='"+ tradeDate + "'";
			rs=sm.executeQuery(sql);

			//判断结果
			if (rs.next()) {
				stockName = rs.getString(1);
			}
			else {
				stockName = null;
			}

			} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//关闭资源
			//this.close();
			dbo.closeDB(conn, sm, rs);
		}
		//取出股票名称
		
		return stockName;
	}

/*
	//关闭资源函数
	public void close(){
		
		try {
			if (rs!=null) {
				rs.close();
				rs=null;
			}
			if (sm!=null) {
				sm.close();
				sm=null;
			}
			if (conn!=null) {
				conn.close();
				conn=null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
}
