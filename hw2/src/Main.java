import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        try {
        string2arr(str);
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
        math(string2arr(str));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//1
    public static String[][] string2arr (String str) throws IOException {
        String[] arr = str.split("\n");
        String[][] strArr = new String [arr.length][];
        for (int a = 0; a < arr.length; a++){
            strArr[a] = arr[a].split(" ");
        }
        return strArr;
    }
//2
    public static int math (String[][] strArr) throws IOException{
        int[][] matrix = new int[strArr.length][strArr.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = Integer.parseInt(strArr[i][j]);
            }
        }
        int summ=0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                summ+=matrix[i][j];
            }
        }
        System.out.println(summ/2);
        return summ/2;
    }
}
