package test.mypac;

@FunctionalInterface // 얘가 있으면 추상메소드가 없어도 안됨, 꼭 1개만 있어야 함 !
public interface Joinner {
	public String Join(String one, String two); // 두 문자열 one, two를 연결해서 리턴하는 메소드라 가정
	
}
