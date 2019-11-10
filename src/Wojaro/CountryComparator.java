package Wojaro;

import java.util.Comparator;

public class CountryComparator implements java.util.Comparator<Tenisista> {

    @Override
    public int compare(Tenisista first, Tenisista second) {
        return first.getKraj().compareTo(second.getKraj());
    }


}
