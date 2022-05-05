package _01_ticket

class Theater(private val ticketSeller: TicketSeller) {
  fun enter(audience: Audience) {
    if (audience.bag.hasInvitation()) {
      val ticket = ticketSeller.ticketOffice.ticket
      audience.bag.setTicket(ticket)
    } else {
      val ticket = ticketSeller.ticketOffice.ticket
      audience.bag.minusAmount(ticket.fee)
      ticketSeller.ticketOffice.plusAmount(ticket.fee)
      audience.bag.setTicket(ticket)
    }
  }
}