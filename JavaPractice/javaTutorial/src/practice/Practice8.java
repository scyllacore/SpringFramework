/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import anotherPackage.Practice8_parent;

/**
 *
 * @author Yoon
 */
public class Practice8 extends Practice8_parent {

    public int b;

    protected Practice8(int a) {
        super(a);
        this.b = 3;
        this.method1();
        this.method2();
    }

    @Override // 클래스 타입변환이 이루어 졌지만 method2를 오버라이딩 한다.
    protected void method2() {//public 가능 default 불가능
        System.out.println("child-method2");
    }

    protected void method3() {
        System.out.println(this.a);
    }

    public static void main(String[] args) {

        Practice8_parent test = new Practice8(3);

        Practice8 test1 = new Practice8(3);

        //System.out.println(test.a);
//부모로 형변환이 된다는 것은 overriding 상황을 제외하고 상속의 속성이 사라짐으로 부모가 다른 패키지에 있다면 protected 멤버들을 사용할 수 없다.
//"부모로 형변환이 된다면 상속의 속성이 사라진다."

System.out.println(test1.a);
        test1.method2();
    }

}
