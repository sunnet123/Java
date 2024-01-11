package ch08.sec09;
/*
 * 날짜 : 2024/01/11
 * 이름 : 최형욱
 * 내용 : 8장 다중 인터페이스 상속
 */ 
public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
