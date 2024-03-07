package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase llamada "contacto" nos permite crear un objeto llamado contacto con un atributo
 * llamado "name" que será el nombre del contacto y con otro atributo en forma de lista llamada
 * "phones" donde podremos añadir varios números telefónicos diferentes.
 * @author AZETA
 * @since 2024
 * @version 1.0
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Método constructor "Contacto" para añadir un objeto contacto.
     * @param name será el nombre del contacto.
     * @param phone será un número de teléfono asociado a este contacto.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Método getName, que sirve para obtener el nombre del contacto citado.
     * @return el nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método getPhone con el que obtenemos la lista de los números asociados al
     * contacto citado.
     * @return la lista de números de teléfono del contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}