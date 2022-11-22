package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int cheese;
    private int topping;
    private int bag;
    private boolean cheeseadded=false;
    private boolean toppingadded=false;
    private boolean bagadded=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            bill+="Base Price Of The Pizza: 300\n";
            price=300;
        }
        else{
            bill+="Base Price Of The Pizza: 400\n";
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(cheeseadded) return;
        cheese=80;
        price+=80;
        cheeseadded=true;
    }

    public void addExtraToppings(){
        if(toppingadded) return;
        if(isVeg) {
            topping = 70;
            price += 70;
        }
        else {
            topping=120;
            price+=120;
        }
        toppingadded=true;
    }

    public void addTakeaway(){
        bag+=20;
        price+=20;
        bagadded=true;
    }

    public String getBill(){
        if(cheeseadded) bill+="Extra Cheese Added: "+cheese+"\n";
        if(toppingadded) bill+="Extra Toppings Added: "+topping+"\n";
        if(bagadded) bill+="Paperbag Added: "+bag+"\n";
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}