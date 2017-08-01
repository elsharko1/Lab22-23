package com.model;

import javax.persistence.*;

/**
 * Created by Mark on 7/31/2017.
 */
@Entity
@Table(name = "items", schema = "coffeeshopdatabase", catalog = "")
public class ItemsEntity {
    private int iditems;
    private String itemsname;
    private String itemscost;
    private int itemsquantity;
    private String itemsdescription;

    @Id
    @Column(name = "iditems", nullable = false)
    public int getIditems() {
        return iditems;
    }

    public void setIditems(int iditems) {
        this.iditems = iditems;
    }

    @Basic
    @Column(name = "itemsname", nullable = false, length = 45)
    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }

    @Basic
    @Column(name = "itemscost", nullable = false, length = 45)
    public String getItemscost() {
        return itemscost;
    }

    public void setItemscost(String itemscost) {
        this.itemscost = itemscost;
    }

    @Basic
    @Column(name = "itemsquantity", nullable = false)
    public int getItemsquantity() {
        return itemsquantity;
    }

    public void setItemsquantity(int itemsquantity) {
        this.itemsquantity = itemsquantity;
    }

    @Basic
    @Column(name = "itemsdescription", nullable = true, length = 45)
    public String getItemsdescription() {
        return itemsdescription;
    }

    public void setItemsdescription(String itemsdescription) {
        this.itemsdescription = itemsdescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemsEntity that = (ItemsEntity) o;

        if (iditems != that.iditems) return false;
        if (itemsquantity != that.itemsquantity) return false;
        if (itemsname != null ? !itemsname.equals(that.itemsname) : that.itemsname != null) return false;
        if (itemscost != null ? !itemscost.equals(that.itemscost) : that.itemscost != null) return false;
        if (itemsdescription != null ? !itemsdescription.equals(that.itemsdescription) : that.itemsdescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iditems;
        result = 31 * result + (itemsname != null ? itemsname.hashCode() : 0);
        result = 31 * result + (itemscost != null ? itemscost.hashCode() : 0);
        result = 31 * result + itemsquantity;
        result = 31 * result + (itemsdescription != null ? itemsdescription.hashCode() : 0);
        return result;
    }
}
