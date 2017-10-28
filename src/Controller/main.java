package Controller;
import java.util.*;

import Model.Histogram;
import View.*;
public class main {

    private static List<String> mailList;
    private static Histogram<String> histogram;

    public static void main(String[] args) {
        execute();
    }

    private static void execute(){
        Input();
        Process();
        Output();
    }

    private static void Input(){
        mailList = MailListReader.read("src/File/emails.txt");
    }

    private static void Process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void Output(){
        (new HistogramDisplay(histogram)).execute();

    }
}
