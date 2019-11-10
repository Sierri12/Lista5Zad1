package Wojaro;

import java.util.Comparator;

public class NameComparator implements Comparator<Tenisista> {

    @Override
    public int compare(Tenisista first, Tenisista second) {
        return first.getImie().compareTo(second.getImie());
    }
}
