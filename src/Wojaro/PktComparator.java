package Wojaro;

import java.util.Comparator;

public class PktComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Integer.compare(o2.getPkt(),o1.getPkt());
    }
}
