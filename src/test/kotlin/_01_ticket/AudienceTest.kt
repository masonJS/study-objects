package _01_ticket

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

internal class AudienceTest: DescribeSpec({
  describe("buy") {
    context("관람객이 초대장이 있는 경우") {
      it("0을 반환한다.") {
        val ticket = Ticket(fee = 100L)
        val invitation = Invitation()
        val bag = Bag(amount = 1000L, invitation = invitation)

        val audience = Audience(bag)
        val amount = audience.buy(ticket)

        amount shouldBe 0
      }
    }

    context("관람객이 초대장이 없는 경우") {
      it("티켓 금액을 반환한다.") {
        val ticket = Ticket(fee = 100L)
        val bag = Bag(amount = 1000L)

        val audience = Audience(bag)
        val amount = audience.buy(ticket)

        amount shouldBe 100L
      }
    }
  }
})