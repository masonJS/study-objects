package _01_ticket

class TicketSeller(private val ticketOffice: TicketOffice) {
  public fun sellTo(audience: Audience) {
    ticketOffice.plusAmount(audience.buy(ticketOffice.ticket))
  }
}