
package com.uia.is12.domain;


public class Prize {
    private int amount;
    private String name;
    private int tickets_needed;
    private String description;
    private int id;

    public Prize() {
    }

    public Prize(int amount, String name, int tickets_needed, String description) {
        this.amount = amount;
        this.name = name;
        this.tickets_needed = tickets_needed;
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTickets_needed() {
        return tickets_needed;
    }

    public void setTickets_needed(int tickets_needed) {
        this.tickets_needed = tickets_needed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
