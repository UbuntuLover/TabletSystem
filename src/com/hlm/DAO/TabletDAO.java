package com.hlm.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.hlm.bean.Tablet;
import com.hlm.common.Factory;

public class TabletDAO {
	
	/**
	 * 插入平板。
	 * */
	public void addTablet(Tablet tablet) throws Exception{
		Connection connection = Factory.getConn();
		String sql = "insert into tablet values(?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, tablet.getId());
		preparedStatement.setString(2, tablet.getSize());
		preparedStatement.setString(3, tablet.getColor());
		preparedStatement.setString(4, tablet.getPrice());
		preparedStatement.setString(5, tablet.getGrand());
		preparedStatement.executeUpdate();
		
	}
	/**
	 * 查询所有平板
	 * */
	public List<Tablet> findAll() throws Exception{
		List<Tablet> list = new ArrayList<Tablet>();
		Connection connection = Factory.getConn();
		String sql = "select * from tablet";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			String id = resultSet.getString(1);
			String size = resultSet.getString(2);
			String color = resultSet.getString(3);
			String price = resultSet.getString(4);
			String grand = resultSet.getString(5);
			Tablet tablet = new Tablet(id, size, color, price, grand);
			list.add(tablet);
			}
		
		
		return list;
		
		
		
	}
	/**
	 * 删除平板。
	 * */
	public void deleteByID(String id) throws Exception {
		Connection connection = Factory.getConn();
		String sql = "delete from tablet where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, id);
		preparedStatement.executeUpdate();
	}
	/**
	 * 修改平板。
	 * */
	public void changeTablet(String id, String color) throws Exception {
		Connection connection = Factory.getConn();
		String sql = "update tablet set color=? where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, color);
		preparedStatement.setString(2, id);
		preparedStatement.executeUpdate();
		System.out.println("更新成功");
		
		
	}
	
	/**
	 * id改价格
	 * */
	public void changeTabletPrice(String id,String price) throws Exception{
		Connection connection = Factory.getConn();
		String sql = "update tablet set price=? where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, price);
		preparedStatement.setString(2, id);
		preparedStatement.executeUpdate();
		System.out.println("更新成功");
		
	}
	/**
	 * id改size
	 * */
	public void changeTabletSize(String id,String size) throws Exception{
		Connection connection = Factory.getConn();
		String sql = "update tablet set size=? where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, size);
		preparedStatement.setString(2, id);
		preparedStatement.executeUpdate();
		System.out.println("更新成功");
		
	}
	/**
	 * id改grand
	 * */
	public void changeTabletGrand(String id,String grand) throws Exception{
		Connection connection = Factory.getConn();
		String sql = "update tablet set grand=? where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, grand);
		preparedStatement.setString(2, id);
		preparedStatement.executeUpdate();
		System.out.println("更新成功");
		
	}
	
	
	
	
	
	
}
