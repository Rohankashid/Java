import java.net.Inet4Address;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.Arrays;

public class Networking {
    public static void main(String[] args)  throws java.net.UnknownHostException{

        String url = "www.google.com";

        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address :"+Arrays.toString(inetAddress.getAddress()));

        System.out.println("host Address :"+inetAddress.getHostAddress());

        System.out.println("isAnyLocalAddress : "+inetAddress.isAnyLocalAddress());
      
        System.out.println("isLinkLocalAddress: "+inetAddress.isLinkLocalAddress());
       
        System.out.println("isLoopBackAddress: "+inetAddress.isLoopbackAddress());
       
        System.out.println("isSiteLocalAddress: "+inetAddress.isSiteLocalAddress());

        System.out.println("hashCode : "+inetAddress.hashCode());
        
        
    }
}
