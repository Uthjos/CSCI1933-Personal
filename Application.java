public class Application {
    public static boolean testAdd(Complex3 first, Complex3 second, double realExpected, double imagExpected) { //testadd( firstcomplex, second complex, real expected, imaginary expected)
        first.addComplex(second);
        double realActual = first.getRealPart();
        double imagActual = first.getImaginaryPart();
        return realExpected == realActual && imagExpected==imagActual;

    }

    public static boolean testSub(Complex3 first, Complex3 second, double realExpected, double imagExpected) { //testSub)firstcomplex, second complex, expected)
        first.subtractComplex(second);
        double realActual = first.getRealPart();
        double imagActual = first.getImaginaryPart();
        return realExpected == realActual && imagExpected==imagActual;
    }
    public static void main(String[] args) {
        //init c
        Complex3 A = new Complex3(5, 6);
        Complex3 B = new Complex3(2,2);
        //test for complex add
        System.out.println(testAdd(A,B,7,8));
        //Test for Complex sub

        System.out.println(testSub(A,B,3,4));
        //new inputs
        A.setRealPart(9);
        A.setImaginaryPart(3);
        B.setRealPart(6);
        B.setImaginaryPart(1);
        //test for new complex add
        System.out.println(testAdd(A,B,15,4));
        //test for new complex sub
        System.out.println(testSub(A,B,3,2));


    }
}