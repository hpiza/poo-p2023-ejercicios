import java.util.Arrays;

public class Sesion6 {

    public static void main(String[] args) {
        String[] alumnos = { "Luis", "Yamile", "Carolina", "Cortez", "José Juan", "Juan Pablo", "Axel",  "José", "Arturo",
                             "Yahir", "Rodrigo", "Yochabel", "Arlyn", "Fernando", "Abdiel", "Francisco", "Samantha",
                              "Saúl", "Alberto", "Yael", "Samuel", "Miguel", "Benjamín", "Sergio"};

//        int aPasar = (int) (alumnos.length * Math.random());
//        System.out.println(aPasar);
//        System.out.println("A pasar: " + alumnos[aPasar]);      // 15, 5, 21, 17, 12, 19, 2
        // sumaMatrices();
        matricesRaras();
    }

    static void matricesRaras() {
        int rows = 10;
        boolean[][] BM = new boolean[rows][];
        for(int r = 0; r < rows; r ++) {
            int cols = 1 + (int) (30 * Math.random());
            BM[r] = new boolean[cols];
            for(int c = 0; c < BM[r].length; c ++) {
                BM[r][c] = Math.random() < 0.5;
            }
        }

        for(boolean[] row: BM) System.out.println(Arrays.toString(row));
        for(int r = 0; r < rows; r ++) {
            for(int c = 0; c < BM[r].length; c ++) {
                System.out.print(BM[r][c]? 1 : 0);
            }
            System.out.println();
        }
    }

    static void sumaMatrices() {
        double[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        double[][] B = {{1.5,2,3},{4,5,6},{7,8,9}};
        double[][] C = new double[A.length][A[0].length];

        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[i].length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (double[] row: C) {
            for (double num: row){
                System.out.printf("%5.1f ", num);
            }
            System.out.println("");
        }

        String[][] himnoNacional = {
                {"Mexicanos", "al", "grito", "de", "guerra"},
                {"el", "acero", "aprestad", "y", "el", "bridón"},
                {"ya", "me", "cansé"}
        };
        System.out.println(himnoNacional.length);       // imprime 3 (renglones)
        System.out.println(himnoNacional[0].length);    // imprime 5 (palabras en el primer renglón
        System.out.println(himnoNacional[1].length);    // imprime 6 (palabras en el segundo renglón
        System.out.println(himnoNacional[2].length);    // imprime 3 (palabras en el tercer renglón
        // System.out.println(himnoNacional[3].length);    // Excepción
        int articulos = contarArticulos(himnoNacional, "El");
        System.out.println(articulos);
    }

    static int contarArticulos(String[][] data, String palabra) {
        int count = 0;
        for(String[] row: data){
            for(String word: row){
                if(palabra.equalsIgnoreCase(word)) {
                    count++;
                }
            }
        }
        return count;
    }

}
