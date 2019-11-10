package Wojaro;

import java.util.Comparator;

public class PositionComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Integer.compare(o1.getPozycja(),o2.getPozycja());
    }
}
