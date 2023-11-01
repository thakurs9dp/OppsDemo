package com.example.oopsdemo.oops.classes

class Pen() {

    //Definition class is a blue print of data and Members

    //Data (Properties)
    var name : String = ""
    var type : String = ""
    var colour : String = ""

    //Members (Methods)
    fun showPen() {
       println("Pen name is ${this.name} , type is ${this.type} and colour of pen is ${this.colour}")
    }

}