/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice12 {

    public static void main(String[] args) {
        Practice12interface[] pt = {
            new Practice12implement(),
            new Practice12implement1()
        };

        pt[0].fuc(10);
        pt[1].fuc(10);

        pt[0] = new Practice12implement1();

        pt[0].fuc(10);

        pt[0] = new Practice12implement();

        for (Practice12interface pts : pt) {
            pts.fuc(5);
            testFuc(pts);
        }

        pt[0].interChild();

        if ((pt[0] instanceof Practice12implement)) {
            Practice12implement ptTest = (Practice12implement) pt[0];
            ptTest.imple();

        }

        if ((pt[1] instanceof Practice12implement1)) {
            Practice12implement1 ptTest = (Practice12implement1) pt[1];
            ptTest.imple();

        }

        pt[1].f();
        pt[0].f();
        
        pt[1].interChild();
        
        pt[1].interParent();
        
        

    }

    private static void testFuc(Practice12interface pt) {
        pt.fuc(10);
    }

}
