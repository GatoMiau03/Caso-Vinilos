package org.example;
import java.util.ArrayList;

class ColeccionVinilos {
    static final int MAX_VINILOS = 100;
    private ArrayList<Vinilo> vinilos;

    public ColeccionVinilos() {
        vinilos = new ArrayList<>();
    }

    public boolean agregarVinilo(Vinilo vinilo) {
        if (vinilos.size() < MAX_VINILOS) {
            vinilos.add(vinilo);
            return true;
        } else {
            return false;
        }
    }

    public boolean buscarVinilo(Vinilo vinilo) {
        return vinilos.contains(vinilo);
    }

    public int cantidadVinilos() {
        return vinilos.size();
    }

    public int espaciosDisponibles() {
        return MAX_VINILOS - vinilos.size();
    }
}
