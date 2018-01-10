import java.net.*;
import java.io.*;
public class CONNECTION {
    public static void main(String[] args) throws Exception {
        URL WIRED2TECH = new URL("http://www.wired2tech.org/");
        URLConnection yes = WIRED2TECH.openConnection();
        BufferedReader enter1 = new BufferedReader(
                                new InputStreamReader(
                               yes .getInputStream()));
        String inputLine;

        while ((inputLine = enter1.readLine()) != null) 
            System.out.println(inputLine);
        enter1.close();
    }
}