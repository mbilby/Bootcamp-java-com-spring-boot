package services;

import java.util.Comparator;

import model.Pessoa;

public class OrdenacaoPorAltura implements Comparator <Pessoa> {

     @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
