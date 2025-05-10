// Exemplo de implementação de uma interface para um serviço RMI

package rmi_test;

import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoPotencia extends Remote{
    // Calcula o quadrado de um número
    public BigInteger quadrado(int numero) throws RemoteException;

    // Calcula a potência de um número
    public BigInteger potencia(int numero, int potencia) throws RemoteException;
}