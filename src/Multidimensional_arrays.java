public class Multidimensional_arrays {
    public static void main(String[] args){
        int[] numbers={1,2,3};
        System.out.println(numbers[2]);
        System.out.println();
        int[][]matrix=new int[6][8];
        for(int i=0;i<matrix.length;i++){
            for(int y=0;y<matrix[i].length;y++) {
                matrix[i][y] = i;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int y=0;y<matrix[i].length;y++){
                System.out.print(matrix[i][y]+" ");
            }
            System.out.println();
        }
    }
}
