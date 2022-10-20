public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(5,7);
        System.out.println(m1);
        System.out.println();    
        Matrix m2 = new Matrix(2,3);
        System.out.println(m2);
        System.out.println();
        System.out.println(m2.getElemOssz());
        System.out.println(m2.getPozitivDb());
        System.out.println(m2.getMaxElem());
        System.out.println(m2.getElsoPozitiv()[0] + " " + m2.getElsoPozitiv()[1]);
    }
}