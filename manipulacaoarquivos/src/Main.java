import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    try {
        //ler um novo arquivo
        InputStream is = new FileInputStream("entrada.txt");  //InputStream é classe abstrata mãe de FileInputStream
        InputStreamReader ir = new InputStreamReader(is);   //classe para você não se preocupar com o formato do arquivo: converter os bytes lidos em caracteres UTF-8
        BufferedReader br = new BufferedReader(ir); //ler as linhas de texto do arquivo
        //escrever em um novo arquivo
        OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter or = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(or);

        String linha  = "";
        while (true) {    //loop infinito para repetir a leitura de linhas
            linha = br.readLine();  //le somente uma linha
            if (linha == null)  //se ao ler, não receber nenhuma linha, ou seja, estiver nulo, faça:
                break;
            System.out.println(linha);
            bw.write(linha+"\n");
        }
        br.close(); // fecha o arquivo entrada
        bw.close(); // fecha o arquivo saida

    }catch (FileNotFoundException ex){
        System.out.println("Erro na abertura do arquivo: "+ex);
    }catch (IOException ex){
        System.out.println("Erro na abertura do arquivo: "+ex);
        System.out.println("fim de programa.");
    }
    }
}