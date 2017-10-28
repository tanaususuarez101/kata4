package Controller;
import java.util.*;

import Model.Histogram;
import View.*;
public class main {
    public static void main(String[] args) {
        Histogram<String> histogram = MailHistogramBuilder.build(
                MailListReader.read("src/File/emails.txt")
        );
        (new HistogramDisplay(histogram)).execute();
    }
}
