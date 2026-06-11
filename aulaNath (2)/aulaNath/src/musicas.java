import java.io.PrintWriter;
public class musicas {
    public static void main(String[] args) throws Exception {
        String[][] musicas = new String[3][2];

        musicas[0][0] = "Michael jackson";
        musicas[0][1] = "Justin Bieber";
        musicas[1][0] = "Bruno Mars";
        musicas[1][1] = "Thales Roberto";
        musicas[2][0] = "Eli Soares";
        musicas[2][1] = "Bruna Carla";

        //Criar o arquivo CSV

        PrintWriter gravar = new PrintWriter("Musica.csv");
        //Titulo das Colunas do Excel

        gravar.println("Cantor;Musica");

        //For paraa percorrer a matriz
        for (int i = 0; i < 3; i++) {

            gravar.println(musicas[i][0] + ";" + musicas[i][1]);

        }
    }
}
