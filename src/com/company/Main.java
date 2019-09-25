package com.company;

import com.company.Present.Chocolate;
import com.company.Present.Lollipop;
import com.company.Present.Present;

public class Main {
    public static void main(String[] args) {

        Present somePresent = new Present();

        Lollipop lollipop1 = new Lollipop("Чупа-Чупс", 100, 200, "клубничный");
        Lollipop lollipop2 = new Lollipop("Петушок", 50, 250, "лимонный");
        Chocolate chocolate1 = new Chocolate("Аленка", 200, 350, "молочный");
        Chocolate chocolate2 = new Chocolate("Милка", 250, 400, "горький");

        Present[] box = {lollipop1, lollipop2, chocolate1, chocolate2};

        System.out.println("Формируем подарок...");
        System.out.println("\nОбщий вес подарка: " + somePresent.getAllWeight(box));
        System.out.println("Итоговая цена подарка : " + somePresent.getAllPrice(box));
        System.out.println("\nВ подарке: ");

        for (int i=0; i<box.length; i++ ) {
            System.out.println(box[i].toString());
        }


    }

}