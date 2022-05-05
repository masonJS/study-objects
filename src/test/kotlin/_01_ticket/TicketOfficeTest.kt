package _01_ticket

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

internal class TicketOfficeTest: DescribeSpec({
  describe("sellTicketTo") {
    context("관람객에게 티켓을 판매할 경우") {
      it("판매 금액을 보유한다.") {
        val ticketOffice = TicketOffice(0L, Ticket(100L), Ticket(200L))
        val bag = Bag(amount = 1000L)
        val audience = Audience(bag)

        ticketOffice.sellTicketTo(audience)

        ticketOffice.amount shouldBe 100L
      }
    }
  }
})