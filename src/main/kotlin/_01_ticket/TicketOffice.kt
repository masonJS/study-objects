package _01_ticket

import java.util.*

class TicketOffice(private var amount: Long, vararg tickets: Ticket) {
  private val tickets: MutableList<Ticket> = ArrayList()

  init {
    this.tickets.addAll(listOf(*tickets))
  }

  val ticket: Ticket
    get() = tickets.removeAt(0)

  fun plusAmount(amount: Long) {
    this.amount += amount
  }
}