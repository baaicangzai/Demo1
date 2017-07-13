package com.leyuta.entity;

/**
 * Hero 实体类
 * Created by listen on 2017/7/12
 */
public class Hero
{
        /**
         * 英雄名称
         */
        private String name;

        /**
         * 英雄价格
         */
        private int price;

        public Hero()
        {
        }

        public Hero(String name, int price)
        {
                this.name = name;
                this.price = price;
        }

        public String getName()
        {
                return name;
        }

        public void setName(String name)
        {
                this.name = name;
        }

        public int getPrice()
        {
                return price;
        }

        public void setPrice(int price)
        {
                this.price = price;
        }

        @Override
        public String toString()
        {
                return "Hero{" + "name='" + name + '\'' + ", price=" + price + '}';
        }

}
