package bbangjun.do_it_java.ch07;

public class P220_2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

        int[][] arr2=new int[2][3];

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.println(arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
    }
}
// arr.length는 행의 개수, arr[i].length는 열의 개수