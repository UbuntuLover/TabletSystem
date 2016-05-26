package com.hlm.view;

import java.util.*;

import com.hlm.DAO.TabletDAO;
import com.hlm.bean.Tablet;


public class View {
	
	public static void main(String[] args) throws Exception {
		TabletDAO tabletDAO = new TabletDAO();
		Scanner in = new Scanner(System.in);
		while (true) {
			Menu();
			String line = in.nextLine();
			switch (line) {
			case "1":
				System.out.println("请输入要插入的平板，格式为id:size:color:price:grand");
				String cinLine = in.nextLine();
				String [] arr = cinLine.split(":");
				if (arr[0]==null) {
					System.out.println("主键不能为空");
				}
				else {
					Tablet tablet = new Tablet(arr[0], arr[1], arr[2], arr[3], arr[4]);
					tabletDAO.addTablet(tablet);
				}
				
				break;
			case"2":
				System.out.println("下面是所有平板信息");
				List<Tablet> list = tabletDAO.findAll();
				for (Tablet tablet : list) {
					System.out.println(tablet);
				}
				
				break;
			case"3":
				System.out.println("请输入要删除的平板的ID");
				String id = in.nextLine();
				tabletDAO.deleteByID(id);
				break;
			case"4":
				System.out.println("请输入要修改平板的颜色，格式为id:color");
				String line1 = in.nextLine();
				String []arr2 = line1.split(":");
				tabletDAO.changeTablet(arr2[0], arr2[1]);
				break;
			case"5":
				System.out.println("**请输入修改平板的尺寸，格式为id:size**");
				String line3 = in.nextLine();
				String []arr3 = line3.split(":");
				tabletDAO.changeTabletSize(arr3[0], arr3[1]);
				break;
			case"6":
				System.out.println("**请修改平板的价格，格式为id:price**");
				String line4 = in.nextLine();
				String []arr4 = line4.split(":");
				tabletDAO.changeTabletPrice(arr4[0], arr4[1]);
				break;
			case"7":
				System.out.println("**请修改平板的品牌，格式为id:grand**");
				String line5 = in.nextLine();
				String []arr5 = line5.split(":");
				tabletDAO.changeTabletGrand(arr5[0], arr5[1]);
				break;
			default:
				break;
			}
			
		}
				
	}
	
	
	
	
	private static void Menu () {
		System.out.println("**平板系统管理***");
		System.out.println("**1.插入平板**");
		System.out.println("**2.查询所有平板**");
		System.out.println("**3.删除平板**");
		System.out.println("**4.修改平板的颜色**");
		System.out.println("**5.修改平板的尺寸**");
		System.out.println("**6.修改平板的价格**");
		System.out.println("**7.修改平板的品牌**");
		
	}

}
