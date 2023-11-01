package com.example.oopsdemo.main

import com.example.oopsdemo.oops.classes.Pen

fun main() {

    //create class object 1
    val pen = Pen()
    pen.name = "Revolt"
    pen.type = "Gel"
    pen.colour = "Red"
    pen.showPen()

    //create class object 2
    val  pen2 = Pen()
    pen2.name = "Nova"
    pen2.type = "Non Gel"
    pen2.colour ="Black"
    pen2.showPen()


}