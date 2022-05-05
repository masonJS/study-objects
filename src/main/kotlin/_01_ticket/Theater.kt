package _01_ticket

class Theater(private val ticketSeller: TicketSeller) {
  fun enter(audience: Audience) {
    ticketSeller.sellTo(audience)
  }
}