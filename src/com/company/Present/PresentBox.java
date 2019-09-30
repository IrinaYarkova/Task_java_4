package com.company.Present;

public class PresentBox {
    private Present[] presentBox;
    int presentBoxPrice = 0;
    int presentBoxWeight =0;

    public PresentBox(Present[] presentBox){
        this.presentBox = presentBox;
    }

    public PresentBox() {
    }

    public int presentBoxPrice(){
        for (int i=0; i < presentBox.length; i++){
            presentBoxPrice += presentBox[i].getPrice();
        }
        return presentBoxPrice;
    }

    public int presentBoxWeight (){
        for (int i=0; i < presentBox.length; i++){
            presentBoxWeight += presentBox[i].getWeight();
        }
        return presentBoxWeight;
    }
}

