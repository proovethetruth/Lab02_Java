
public class Matrix {
    int[][] matrix;
    int size = 0;

    Matrix(int n) {
        matrix = new int[n][n];
        size = n;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    Matrix sum(Matrix input) {
        Matrix result = new Matrix(size);
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                result.setElement(i, j, matrix[i][j] + input.getElement(i, j));
            }
        }
        return result;
    }

    Matrix product(Matrix input) {
        Matrix result = new Matrix(size);

        int tmp = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < input.size; j++) {
                for(int k = 0; k < size; k++) {
                    tmp += matrix[i][k] * input.getElement(k, j);
                }
                result.setElement(i, j, tmp);
                tmp = 0;
            }
        }
        return result;
    }

    Vector multiplyByVector(Vector n) {
        Vector result = new Vector(n.size);
        
        int tmp = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                tmp += matrix[i][j] * n.arr[j];
            }
            result.arr[i] = tmp;
            tmp = 0;
        }
        return result;
    }

    void setElement(int row, int column, int value) {
        matrix[row][column] = value;
    }

    int getElement(int row, int column) {
        return matrix[row][column];
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                str.append(matrix[i][j]);
                str.append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
