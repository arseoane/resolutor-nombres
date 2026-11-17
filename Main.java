import java.net.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Dominio: ");
        String url = sc.nextLine();
        System.out.println("=======[ Dominio " + url + " ]========");

        List<InetAddress> inet = List.of(InetAddress.getAllByName(url));

        for(InetAddress ip : inet){
            if(ip instanceof Inet4Address){
                System.out.print("IPv4 ");
            }
            System.out.println(ip.getHostAddress());

        }
        System.out.println("=======[ Equipo local ]========");

        InetAddress inet2 = InetAddress.getLocalHost();
        System.out.println("IP: " + inet2.getHostAddress());
        System.out.println("Nombre: " + inet2.getCanonicalHostName());
        System.out.println("===============");

    }
}
