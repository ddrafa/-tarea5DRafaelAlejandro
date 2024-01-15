/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ddrafa
 */
public class Menu {
    private ArrayList<Producto> catalogos = new ArrayList<>();

    public Menu() {
    }

    public ArrayList<Producto> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(ArrayList<Producto> catalogos) {
        this.catalogos = catalogos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.catalogos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        return Objects.equals(this.catalogos, other.catalogos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu{");
        sb.append("catalogos=").append(catalogos);
        sb.append('}');
        return sb.toString();
    }
    
}
