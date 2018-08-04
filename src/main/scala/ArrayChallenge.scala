object ArrayChallenge extends App {

  var a1:Array[Int] = Array(123,200,343,45,57,62)
  println("hello world")

  println(sum(a1))
  println(avg2(a1))
  println(max(a1))
  println(min(a1))

  def sum (a: Array[Int]):Int = {

    var summed = 0

    a.foreach {summed += _}

    summed
  }

  def avg2 (a: Array[Int]):Double = {

    var average = 0

    for (v <- a)
      average += v

    average / a.length
  }

  def avg (a: Array[Int]):Double = {

  var average = 0

  a.foreach {average += _}

  average / a.length
}

  def max (a:Array[Int]):Int = {
    var m:Int = -1

    a.foreach {x => if (m < x) { m = x}}

    m
  }

  def min (a:Array[Int]):Int = {
    var m:Int = Int.MaxValue

    a.foreach {x => if (m > x) { m = x}}

    m
  }

}
