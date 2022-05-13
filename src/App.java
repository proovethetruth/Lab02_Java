public class App {
    public static void main(String[] args) {
        Matrix a = new Matrix(2);
        a.setElement(1, 1, 0);

        Matrix b = new Matrix(2);
        b.setElement(1, 1, 0);

        for(int j = 0; j < 10; j++) {
            System.out.println("Degree: " + (j + 1));
            System.out.println(b.toString());
            b = b.product(a);
        }
    }
        // Vector a = new Vector(4);
        // Matrix b = new Matrix(4);
        // b.setElement(0, 1, 2);
        // System.out.println(a.toString());
        // System.out.println(b.toString());
        // Vector q = b.multiplyByVector(a);
        // System.out.println(q.toString());
    //}
}
