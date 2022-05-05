package _01_ticket

import java.util.*

class TicketOffice(private var amount: Long, vararg tickets: Ticket) {
  private val tickets: MutableList<Ticket> = ArrayList()

  init {
    this.tickets.addAll(listOf(*tickets))
  }

  fun sellTicketTo(audience: Audience) {
    plusAmount(audience.buy(ticket))
  }

  private val ticket: Ticket
    get() = tickets.removeAt(0)

  private fun plusAmount(amount: Long) {
    this.amount += amount
  }
}