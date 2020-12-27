import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    double lireSolde(String sc) throws RemoteException;
    double debiter(double n,double d) throws RemoteException;
    double crediter(double n,double c) throws RemoteException;
}
