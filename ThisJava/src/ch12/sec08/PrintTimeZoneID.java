package ch12.sec08;

import java.util.TimeZone;
/*
 * 날짜 : 2024/01/19
 * 이름 : 최형욱
 * 내용 : 12장 날짜와 시간 클래스
 */
public class PrintTimeZoneID {
	public static void main(String[] args) {
		
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
}
