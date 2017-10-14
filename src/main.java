public class main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.Increment("gmail.com");histogram.Increment("gmail.com");
        histogram.Increment("ulpgc.com");histogram.Increment("gmail.com");
        histogram.Increment("hotmail.com");histogram.Increment("hotmail.com");
        histogram.Increment("hotmail.com");histogram.Increment("hotmail.com");
        histogram.Increment("ull.com");histogram.Increment("ull.com");

        new HistogramDisplay(histogram).execute();

    }
}
