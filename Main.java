import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println ("Введите размеры матриц, N и M");
        int n = input.nextInt();
        int m = input.nextInt();
        int firstArray[][] = Array(n, m);
        int secondArray[][] = Array(n, m);
        sum(n, m, firstArray, secondArray);
        minus(n, m, firstArray, secondArray);
        umn(n, m, firstArray, secondArray);
    }

    //ввод массивов

    static int[][] Array (int n, int m){
        Scanner input = new Scanner(System.in);
        int array[][] = new int[n][m];
        System.out.println ("Введите значение матрицы");
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; ++i){
            System.out.println();
            for (int j = 0; j < m; ++j){
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        return array;
    }

    //операции
    static int[][] sum (int n, int m, int array1[][], int array2[][]){
        int array3[][] = new int[n][m];
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Матрица суммы: ");
        for (int i = 0; i < n; ++i){
            System.out.println();
            for (int j = 0; j < m; ++j){
                System.out.print(array3[i][j] + " ");
            }
        }
        System.out.println();
        return array3;
    }
    static int[][] minus (int n, int m, int array1[][], int array2[][]){
        int array3[][] = new int[n][m];
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                array3[i][j] = array1[i][j] - array2[i][j];
            }
        }
        System.out.println("Матрица разности: ");
        for (int i = 0; i < n; ++i){
            System.out.println();
            for (int j = 0; j < m; ++j){
                System.out.print(array3[i][j] + " ");
            }
        }
        System.out.println();
        return array3;
    }
    static int[][] umn (int n, int m, int array1[][], int array2[][]){
        int array3[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j]; 
                }
            }
        }
        System.out.println("Матрица умножения: ");
        for (int i = 0; i < n; ++i){
            System.out.println();
            for (int j = 0; j < m; ++j){
                System.out.print(array3[i][j] + " ");
            }
        }
        System.out.println();
        return array3;
    }
    static double del (int n, int m, int array1[][], int array2[][]){
        if (n = m) {int array3[][] = new int[n][m];
            
            return array3[][]
            }
    }
}
