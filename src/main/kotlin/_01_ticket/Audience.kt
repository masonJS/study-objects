package _01_ticket

class Audience(val bag: Bag) {
  public fun buy(ticket: Ticket): Long = if (bag.hasInvitation()) {
    bag.setTicket(ticket)
    0;
  } else {
    bag.minusAmount(ticket.fee)
    bag.setTicket(ticket)
    ticket.fee;
  }
}