import java.io.PrintWriter;
public class boletim3 {
    public static void main(String[] args) throws Exception {
        String[][] notas = new String[3][2];

        notas[0][0] = "Ana";
        notas[0][1] = "10";
        notas[1][0] = "Bruno";
        notas[1][1] = "8.5";
        notas[2][0] = "Carla";
        notas[2][1] = "9.0";

        //Criar o arquivo CSV

        PrintWriter gravar = new PrintWriter("notas.csv");
        //Titulo das Colunas do Excel

        gravar.println("Aluno;Nota");

        //For paraa percorrer a matriz
        for (int i = 0; i < 3; i++) {

            gravar.println(notas[i][0] + ";" + notas[i][1]);


        }
        gravar.close();
        System.out.println("Planilha 'notas.csv' ");
    }
}
