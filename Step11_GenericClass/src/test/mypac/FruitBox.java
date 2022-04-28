package test.mypac;
/*
 * type을 고정해두지 않고 유동성있게 넣고 싶을 때
 * 
 * T는 type 파라미터이다
 * 
 * 저기에 전달된 클래스를 포괄클래스(Generic클래스)라고 한다
 * 
 * 
 */
public class FruitBox<T> {
	// 필드
	private T item;
	
	// 필드에 값을 넣는 메소드
	public void setItem(T item) {
		this.item=item;
	}
	
	// 필드에 저장된 값을 리턴하는 메소드
	public T getItem() {
		return this.item;
	}
}
