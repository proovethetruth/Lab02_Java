import java.util.Random;

public class Vector {
    int[] arr;
    int size = 0;
    Vector(int n) {
        size = n;
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 9;
        }

    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < size; i++) {
                str.append(arr[i]);
                str.append(" ");
            }
        str.append("\n");
        return str.toString();
    } 
}
