// Implementação da classe servidora

package rmi_test;

import java.math.BigInteger;
import java.rmi.AlreadyBoundExption;
import java.rmi.RemoteException;
import java.rmi.registry.LocateResgistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServicoPotenciaServidor implements ServicoPotencia{
    // Declara o construtor padrão do serviço
    public ServicoPotenciaServidor() throws RemoteException{
        super();
    }

    // Calcula o quadrado de um número
    @Override
    public BigInteger quadrado(int numero) throws RemoteException{
        // Converte o número recebido para um BigInteger
        BigInteger biNum = new BigInteger(String.valueOf(numero));

        // Calcula o quadrado, multiplicando o número por ele mesmo
        biNum.multiply(biNum);

        // Retorna o valor calculado
        return biNum;

        // Calcula a potência de um número
        @Override
        public BigInteger potencia(int numero, int potencia) throws RemoteException{
            // Converte o número recebido para um BigInteger
            BigInteger biNum = new BigInteger(String.valueOf(numero));

            // Calcula a potência
            biNum.pow(potencia);

            // Retorna o valor calculado
            return biNum;
        }

        // Declaração do método main, que implementa as rotinas de segurança
        public static void main(String[] args){
            try{
                // Cria a instância da classe servidora do serviço
                ServicoPotencia stub = (ServicoPotencia) UnicastRemoteObject.exportObject(obj, 0);

                // Inicia o registry RMI
                Registry registry = LocateResgistry.getRegistry();

                // Atribui o nome do serviço
                registry.bind("ServicoPotencia", stub);

                System.out.printIn("Serviço adicionado");
            }catch (RemoteException ex){
                System.out.printIn("Erro no servidor: " + ex.getMessage());
            }catch(AlreadyBoundExption ex){
                System.out.printIn("Erro no servidor: " + ex.getMessage());
        }
    }
}

