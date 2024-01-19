package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;
/*
 * 날짜 : 2024/01/19
 * 이름 : 최형욱
 * 내용 : 12장 룸복 사용하기
 */
@Data
public class Member {
	private final String id;
	@NonNull private String name;
	private int age;

}
