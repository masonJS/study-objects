package _01_ticket

class TicketSeller(private val ticketOffice: TicketOffice) {
  public fun sellTo(audience: Audience) {
    if (audience.bag.hasInvitation()) {
      val ticket = ticketOffice.ticket
      audience.bag.setTicket(ticket)
    } else {
      val ticket = ticketOffice.ticket
      audience.bag.minusAmount(ticket.fee)
      ticketOffice.plusAmount(ticket.fee)
      audience.bag.setTicket(ticket)
    }
  }
}