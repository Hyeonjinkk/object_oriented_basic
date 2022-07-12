package ch08;

public class Person {
	// 멤버 변수
	public int height;
	public int weight;
	public int age;
	public String name;
	
	public Person(int height, int weight, int age, String name) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.name = name;
	}
	
	public void showPersonInfo() {
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + " 킬로인 남성이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다");
	}
	
}
