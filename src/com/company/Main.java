package com.company;

public class Main {
    public static void main(String[] args) {

        //Создание сладостей
        Sweet sw1 = new Sweet(1, "Конфета", 100, 50);
        Sweet sw2 = new Sweet(2, "Леденец", 50, 100);
        Sweet sw3 = new Sweet(3, "Шоколадка", 150, 200);
        Sweet sw4 = new Sweet(4, "Пряник", 70, 80);
        Sweet sw5 = new Sweet(5, "Печенье", 120, 100);

        int allWeight = sw1.getWeight() + sw2.getWeight() + sw3.getWeight() + sw4.getWeight() + sw5.getWeight();
        int allPrice = sw1.getPrice() + sw2.getPrice() + sw3.getPrice() + sw4.getPrice() + sw5.getPrice();

        System.out.println("Формируем подарок... ");
        System.out.println("Вес подарка: " + allWeight + "г");
        System.out.println("Стоимость подарка: " + allPrice + "р");
        System.out.println("В подарке: ");
        System.out.println(sw1.getName() + ", " + sw1.getWeight() + "г стоимостью " + sw1.getPrice() + "р");
        System.out.println(sw2.getName() + ", " + sw2.getWeight() + "г стоимостью " + sw2.getPrice() + "р");
        System.out.println(sw3.getName() + ", " + sw3.getWeight() + "г стоимостью " + sw3.getPrice() + "р");
        System.out.println(sw4.getName() + ", " + sw4.getWeight() + "г стоимостью " + sw4.getPrice() + "р");
        System.out.println(sw5.getName() + ", " + sw5.getWeight() + "г стоимостью " + sw5.getPrice() + "р");
    }

    public static class Sweet {
        private int id; //уникальный параметр
        private String name;
        private int weight;
        private int price;

        public Sweet(int id, String name, int weight, int price) {
            this.id = id;
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public int getPrice() {
            return price;
        }

    }

}