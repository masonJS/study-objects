package _01_ticket

class Audience(private val bag: Bag) {
  fun buy(ticket: Ticket): Long = bag.hold(ticket)
}