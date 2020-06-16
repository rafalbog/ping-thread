import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");





String [] try1 =  new   String [100] ;
try1[0]="192.168.1.";


for (   int i=1; i<101; i++)
try1[i]=try1



ip_check [] check1 = new [100] ip_check();

check1.start();





    }
public static String get_ipv4(){


    Scanner key_get = new Scanner(System.in);

    String ip_gotten=key_get.nextLine();

    return ip_gotten;



}



}






class  ip_check extends Thread{


    public String getIpv4() {
        return ipv4;
    }

  public ip_check(String ipv4){
        this.ipv4 =ipv4;

  }

    String ipv4;


        public void run(){

            try {
                InetAddress ipv4_innet_check = InetAddress.getByName(ipv4);

          if( ipv4_innet_check.isReachable(1000))
              System.out.println("address "+ipv4+" is alive ");
          else                System.out.println("address "+ipv4+" is ded ");




            } catch (IOException e) {
                e.printStackTrace();
            }



        }






}



