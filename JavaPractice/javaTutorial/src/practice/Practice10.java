/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice10 {

    public static void main(String[] args) {
        Practice10cat Cat = new Practice10cat();
        Practice10dog Dog = new Practice10dog();
        // Practice10animal animal = new Practice10animal(); 추상 클래스임으로 오류
        Practice10animal Animal = null;

        Cat.sound();
        Dog.sound();

        Animal = Cat;
        Animal.sound();
        Animal = Dog;
        Animal.sound();

        animalSound(Cat);
        animalSound(Dog);

        Cat.Breath();
        
    }

    public static void animalSound(Practice10animal Animal) {
       /* if ((Animal instanceof Practice10cat) || (Animal instanceof Practice10dog)) { -> Animal instance를 생성할 수 없음으로 필요 없음.
            Animal.sound();
        } else {
            System.out.println("변환불가");
        }*/
       
       Animal.sound();
       
       
    }

}
