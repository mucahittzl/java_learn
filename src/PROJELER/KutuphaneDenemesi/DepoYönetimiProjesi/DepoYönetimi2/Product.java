package PROJELER.KutuphaneDenemesi.DepoYönetimiProjesi.DepoYönetimi2;

public class Product {
    int id;
    int quantity;
    String name;
    String producer;
    String unit;
    String shelf;

    Product() {

    }

    Product(int id, String name, String producer, String unit) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.unit = unit;
    }
}
