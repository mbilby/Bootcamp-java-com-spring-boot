import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        boolean clientePresente = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        List<String> serviçosContratados = new ArrayList<>();
        for (String parte : partes) {
            serviçosContratados.add(parte);
        }
        
        clientePresente = serviçosContratados.contains(nomeCliente);
        contratado = serviçosContratados.contains(servico);

        String retorno = clientePresente && contratado ? "Sim" : "Não"; 
        System.out.println(retorno);
        
        scanner.close();
    }
}

