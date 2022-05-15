package com.actitime.generics;

import java.io.IOException;

public class Demo {
	
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
//	System.out.println(f.getPropertyData("username"));
	
//	System.out.println(f.getExcelData("CreateCustomer",1,2));
	f.setExcelData("CreateCustomer",1,1,"popo");
}

}
