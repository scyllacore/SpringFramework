/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public interface Practice12interface extends Practice12inter {

    int MAX_VAL = 10;

    public void fuc(int n);

//    @Override
//     public default void interParent(){
//         System.out.println("interChild-Parent");
//     }
    @Override
    public abstract void interParent();

    public default void interChild() {
        System.out.println("interChild");
    }
}
