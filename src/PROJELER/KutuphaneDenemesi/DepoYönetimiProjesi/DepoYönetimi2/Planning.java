package PROJELER.KutuphaneDenemesi.DepoYönetimiProjesi.DepoYönetimi2;

import java.util.ArrayList;

public interface Planning {
    int idBase = 1001;

    void pSpecification(String name, String producer, String unit);
    ArrayList<Product> pList();
    void pShelving(int id, String shelf);//bu methoa-d su aksi



}
