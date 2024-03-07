/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.example;

import java.util.List;

/**
 *
 * @author AZETA
 */
public interface IAgenda {

    /**
     * Método addContact sirve para añadir un contacto a la lista previamente creada.
     * @param name el nombre del contacto que se quiere añadir.
     * @param phone el número de teléfono del contacto que queremos añadir.
     */
    void addContact(String name, String phone);

    /**
     * Método getContacts que sirve para obtener los contactos de una lista.
     * @return los contactos añadidos a la lista indicada.
     */
    List<Persona> getContacts();

    /**
     * El método modifyPhoneNumber sirve para modificar el número de teléfono del contacto añadido previamente.
     * @param name el nombre del contacto.
     * @param oldPhone el número de teléfono previamente añadido que queremos cambiar.
     * @param newPhone el número de teléfono que queremos añadir.
     */
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    /**
     * El método removeContact sirve para borrar un contacto de la lista previamente creada.
     * @param name el nombre del contacto que queremos eliminar.
     */
    void removeContact(String name);
    
}
