package Wojaro;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Tenisista> {

    @Override
    public int compare(Tenisista first, Tenisista second) {
        return first.getNazwisko().compareTo(second.getNazwisko());
    }
}
