package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta clase llamada "Agenda" nos permite crear diferentes listas de contactos
 * y nos permite realizar algunas funciones, mediante métodos, con esos contactos.
 * @version 1.0
 * @since 2024
 * @author Abel Martínez
 */
public class Agenda {
    public List<Contacto> contacts; // Lista de Contacto
    
    /**
     * Método constructor por defecto que crea una nueva lista de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método addContact sirve para añadir un contacto a la lista previamente creada.
     * @param name el nombre del contacto que se quiere añadir.
     * @param phone el número de teléfono del contacto que queremos añadir.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            getContacts().add(newContact);
        }
    }

    /**
     * El método removeContact sirve para borrar un contacto de la lista previamente creada.
     * @param name el nombre del contacto que queremos eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = getContacts().iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * El método modifyPhoneNumber sirve para modificar el número de teléfono del contacto añadido previamente.
     * @param name el nombre del contacto.
     * @param oldPhone el número de teléfono previamente añadido que queremos cambiar.
     * @param newPhone el número de teléfono que queremos añadir.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Método getContacts que sirve para obtener los contactos de una lista.
     * @return los contactos añadidos a la lista indicada.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }

    /**
     * @param contacts the contacts to set
     */
    private void setContacts(List<Contacto> contacts) {
        this.contacts = contacts;
    }
}