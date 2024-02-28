package com.example.kelineyt.data

sealed class Category(val category: String) {

    object Chair: Category("Chocotejas")
    object Cupboard: Category("Para Regalar")
    object Table: Category("Chocolates")
    object Accessory: Category("Barras de Chocolate")
    object Furniture: Category("Bombones y Trufas")
}