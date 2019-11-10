package Wojaro;

import java.util.Comparator;

public class MatchesComparator implements Comparator<Tenisista> {

    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Integer.compare(o2.getMatches(),o1.getMatches());
    }
}
