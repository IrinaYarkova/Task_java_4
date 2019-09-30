package com.company;

import com.company.Present.Chocolate;
import com.company.Present.Lollipop;
import com.company.Present.Present;
import com.company.Present.PresentBox;

public class Main {
    public static void main(String[] args) {

        Present somePresent = new Present();

        Lollipop lollipop1 = new Lollipop("Чупа-Чупс", 100, 200, "клубничный");
        Lollipop lollipop2 = new Lollipop("Петушок", 50, 250, "лимонный");
        Chocolate chocolate1 = new Chocolate("Аленка", 200, 350, "молочный");
        Chocolate chocolate2 = new Chocolate("Милка", 250, 400, "горький");

        Present[] box = {lollipop1, lollipop2, chocolate1, chocolate2};
        PresentBox presentBox = new PresentBox(box);

        System.out.println("Формируем подарок...");
        System.out.println("\nОбщий вес подарка: " + presentBox.presentBoxWeight());
        System.out.println("Итоговая цена подарка : " + presentBox.presentBoxPrice());
        System.out.println("\nВ подарке: ");

        for (int i=0; i<box.length; i++ ) {
            System.out.println(box[i].toString());
        }


    }

}