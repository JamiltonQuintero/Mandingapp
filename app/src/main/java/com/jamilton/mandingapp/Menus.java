package com.jamilton.mandingapp;

import java.util.ArrayList;

public class Menus {

    public ArrayList<Menu> obtenerMismEnus(){
        ArrayList<Menu>misMenus = new ArrayList<>();

        misMenus.add(new Menu("Super Mandigas", R.drawable.papas1));
        misMenus.add(new Menu("Mini Mandigas", R.drawable.papas2));
        misMenus.add(new Menu("Paponas", R.drawable.papas3));
        misMenus.add(new Menu("Mandi Burger", R.drawable.papas4));
        misMenus.add(new Menu("Super Mandigas", R.drawable.papas1));
        misMenus.add(new Menu("Mini Mandigas", R.drawable.papas2));
        misMenus.add(new Menu("Paponas", R.drawable.papas3));
        misMenus.add(new Menu("Mandi Burger", R.drawable.papas4));



        return misMenus;
    }

}
