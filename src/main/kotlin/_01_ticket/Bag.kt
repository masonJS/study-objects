package _01_ticket

/** (초대장 + 현금) 이거나 현금을 소지한 경우에 대한 생성자 */
class Bag(var amount: Long, private var invitation: Invitation? = null) {
  private var ticket: Ticket? = null

  fun hold(ticket: Ticket): Long = if (hasInvitation()) {
    setTicket(ticket)
    0;
  } else {
    minusAmount(ticket.fee)
    setTicket(ticket)
    ticket.fee;
  }

  /** 초대장 보유 여부 */
  private fun hasInvitation(): Boolean {
    return invitation != null
  }

  /** 초대장을 티켓으로 교환 */
  private fun setTicket(ticket: Ticket) {
    this.ticket = ticket
  }

  /** 현금 감소 */
  private fun minusAmount(amount: Long) {
    this.amount -= amount
  }
}