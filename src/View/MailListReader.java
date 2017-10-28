package View;
import java.util.*;
import java.io.*;

public class MailListReader{

    public static List<String> read(String name){
        List<String> mailList = new ArrayList<>();;
        String mail;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(name)));
            while ((mail = reader.readLine()) != null) if(mail.contains("@")) mailList.add(mail);
            reader.close();
        }
        catch(FileNotFoundException a){System.out.println("Fichero no encontrado "+a);}
        catch (IOException a){System.out.println("Error entrada y salida "+a);}
        return mailList;
    }
}
