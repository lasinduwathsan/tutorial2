
//------------------------>Q4.b
object Main {
  def main(args: Array[String]): Unit = {
    println("The highest profit:" + profit(25))
  }
  def attendees(price:Int):Int={
    return 120+(15-price)/5*20
  }
  def revenue(price:Int):Int={
    return attendees(price)*price
  }
  def cost(price:Int):Int={
    return 500+3*attendees(price)
  }
  def profit(price:Int):Int={
    return revenue(price)-cost(price)
  }
    /* Ticket price is 25 ---- profit=1260
       Ticket price is 30 ---- profit=1120
       Ticket price is 35 ---- profit=780
       Ticket price is 40 ---- profit=240

       Ticket price is 20 ---- profit=1200
       Ticket price is 15 ---- profit=940
     */
}