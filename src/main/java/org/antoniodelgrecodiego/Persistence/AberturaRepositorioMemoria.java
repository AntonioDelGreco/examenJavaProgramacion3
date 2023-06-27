package org.antoniodelgrecodiego.Persistence;

import org.antoniodelgrecodiego.Model.Abertura;

import java.util.ArrayList;

public class AberturaRepositorioMemoria {
    private static ArrayList<Abertura> database = new ArrayList<Abertura>();

    public AberturaRepositorioMemoria(){}

    public void save(Abertura abertura){
        database.add(abertura);
    }

    public ArrayList<Abertura> getAllAberturas(){
        return database;
    }
}
