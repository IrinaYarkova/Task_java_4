package com.company.Present;

public class Present {

        private String name;
        private int weight;
        private int price;

        public Present(String name, int weight, int price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        public Present() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public  String toString(){
            return  name + " -  " + weight + "г стоимостью " + price + "р";
        }

        public int getAllPrice(Present[] array){
            int allPrice = 0;
            for (int i=0; i < array.length; i++){
                allPrice += array[i].getPrice();
            }
            return allPrice;
        }

        public int getAllWeight(Present[] array){
            int allWeight = 0;
            for (int i=0; i < array.length; i++){
                allWeight += array[i].getWeight();
            }
            return allWeight;
        }

}
