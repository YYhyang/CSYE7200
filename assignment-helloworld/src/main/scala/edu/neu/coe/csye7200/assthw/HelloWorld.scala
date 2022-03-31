package edu.neu.coe.csye7200.assthw

/**
  * Created by scalaprof on 8/25/16.
  *
  * This is the first part of assignment,
  * You should able to run this HelloWorld and
  * HelloWorldSpec under test folder,
  * Your submission should be the screenshot of
  * running HelloWorldSpec and pass the test.
  */
object HelloWorld extends App {
  def greeting = "Hello World!"
  val list=List(1,2,3)
  val newList=list map toString
  newList foreach println
  println(greeting)
}
