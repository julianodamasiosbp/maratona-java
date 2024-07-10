package src.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = new int[]{3, 4, 5};
        arrayInt[2] = new int[]{6, 7, 8, 9};

        for(int[] arrBase: arrayInt){
            for(int num : arrBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }

    }
}
