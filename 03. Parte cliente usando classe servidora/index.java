// Exemplo de cliente

import java.rmi.*;
import java.rmi.Naming;
import java.io.*;

public class ClienteServicoPotencia{
    public static void main (String args[]) throws Exception{
        // Verifica se os parâmetros de execução estão corretos
        if(args.length != 1){
            System.out.print("Para executar este exemplo, digite ClienteServicoPotencia [IP da máquina servidora]");

            System.exit(1);
        }

        // Tenta executar o serviço no servidor
        ServicoPotencia servico = (ServicoPotencia) Naming.lookup("rmi://" + args[0] + "/ServicoPotencia");

        DataInputStream din = new DataInputStream (System.in);

        for (;;){
            System.out.print("1 - Calcula o quadrado");
            System.out.print("2 - Calcula a potência");
            System.out.print("");
            System.out.print("Escolha uma das opções");

            String linha = din.readLine();

            Integer escolha = new Integer(linha);

            int valor = escolha.intValue();

            switch(valor){
                case 1:
                    System.out.print("Número: ");
                    linha = din.readLine();
                    
                    System.out.print("");
                    escolha = new Integer(linha);
                    valor = escolha.intValue();

                    // Executa metosdos remoto
                    System.out.printIn("Resposta: " + servico.quadrado(valor));
                break;
                
                case 2:
                System.out.print("Número: ");
                linha = din.readLine();

                System.out.print("");
                escolha = new Integer(linha);
                valor = escolha.intValue();

                System.out.print("Potência: ");
                linha = din.readLine();

                System.out.print("");
                escolha = new Integer(linha);
                int potencia = escolha.intValue();

                // Executa o método remoto
                System.out.printIn("Resposta: " + servico.potencia(valor, potencia));
            break;

            case 3:
                System.exit(0);

                default:

                System.out.print("Opção Invalida!!!");
            break;
            }
        }
    }
}