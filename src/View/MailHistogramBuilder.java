package View;
import Model.*;
import java.util.*;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<String>mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1: histo.keySet() ) {
            histo.Increment(new Mail(mail1).getDomain());
        }
        return histo;
    }
}
