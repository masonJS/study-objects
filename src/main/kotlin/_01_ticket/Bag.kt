package _01_ticket

/** (초대장 + 현금) 이거나 현금을 소지한 경우에 대한 생성자 */
class Bag(private var amount: Long, private var invitation: Invitation?) {
  private var ticket: Ticket? = null

  /** 초대장 보유 여부 */
  fun hasInvitation(): Boolean {
    return invitation != null
  }

  /** 티켓 소유 여부 */
  fun hasTicket(): Boolean {
    return ticket != null
  }

  /** 초대장을 티켓으로 교환 */
  fun setTicket(ticket: Ticket) {
    this.ticket = ticket
  }

  /** 현금 감소 */
  fun minusAmount(amount: Long) {
    this.amount -= amount
  }
}