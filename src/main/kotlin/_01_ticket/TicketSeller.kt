package _01_ticket

class TicketSeller(private val ticketOffice: TicketOffice) {
  public fun sellTo(audience: Audience) {
    ticketOffice.sellTicketTo(audience)
  }
}