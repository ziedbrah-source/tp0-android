package com.gl4.tp


fun main(argv : Array<String> ){
    val arr =  arrayOf(Rectangle(),Rectangle(Point(2,2),
        Point(5,5)))
    for (x in arr) {
        println(x.surface())
    }
}
