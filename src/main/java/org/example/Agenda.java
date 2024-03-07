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
public class Agenda implements IAgenda {
    public List<Persona> contacts; // Lista de Persona
    
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
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            getContacts().add(newContact);
        }
    }

    /**
     * El método removeContact sirve para borrar un contacto de la lista previamente creada.
     * @param name el nombre del contacto que queremos eliminar.
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = getContacts().iterator();

        while (it.hasNext()) {
            Persona c = it.next();

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
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : getContacts()) {
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
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }

    /**
     * @param contacts the contacts to set
     */
    private void setContacts(List<Persona> contacts) {
        this.contacts = contacts;
    }
}