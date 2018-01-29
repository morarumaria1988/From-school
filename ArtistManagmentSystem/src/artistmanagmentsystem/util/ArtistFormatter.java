package artistmanagmentsystem.util;

import module.Artist;
import java.util.List;

public class ArtistFormatter {

    public static String format(Artist artist) {
        String header = header();
        StringBuilder sb = new StringBuilder();
        sb.append(header).append('\n');
        sb.append(formatWithoutBorder(artist)).append('\n');
        sb.append(footer());
        return sb.toString();
    }

    public static String format(List<Artist> artists) {

        String header = header();
        StringBuilder sb = new StringBuilder();
        sb.append(header).append('\n');
        for (Artist artist : artists) {
            sb.append(formatWithoutBorder(artist)).append('\n');
        }
        sb.append(footer());
        return sb.toString();
    }

    public static String formatWithoutBorder(Artist artist) {
        return String.format("| %-4d | %-13s | %-13s | %-9d |",
                artist.getId(), artist.getName(), artist.getLasName(), artist.getAge());
    }

    private static String header() {
        return "******************************************************\n" +
                "|  ID  |  First name   |   Last Name   |    Age    |\n " +
                "*****************************************************";
    }

    public static String footer() {
        return "******************************************************\n";
    }
}
