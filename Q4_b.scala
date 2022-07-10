object Main {
  def main(args: Array[String]): Unit = {
    println("The highest profit is:"+profit(25))
  }

  def attendance(ticket_price:Int):Int={
    return 120 +(15-ticket_price)/5*20
  }

  def total_Revenue(ticket_price:Int):Int={
    return attendance(ticket_price)*ticket_price
  }

  def total_cost (ticket_price:Int):Int={
    return 500+ 3*attendance(ticket_price)
  }

  def profit(ticket_price:Int):Int={
    return total_Revenue(ticket_price)-total_cost(ticket_price)
  }
}

/*

  the ticket price is 15: profit is=  940
  the ticket price is 20: profit is= 1200
  the ticket price is 25: profit is= 1260
  the ticket price is 30: profit is= 1120
  the ticket price is 35: profit is=  780
  the ticket price is 40: profit is=  240

 */