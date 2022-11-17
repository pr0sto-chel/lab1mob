package com.example.lab1mobil

import kotlin.random.Random

class fornumbers {
  val numbers: List<Int> = List(10){
    Random.nextInt(1, 10)
  }
  fun lessfind(number:Int): Int{
    return numbers.filter {it < number }.size
  }
}
