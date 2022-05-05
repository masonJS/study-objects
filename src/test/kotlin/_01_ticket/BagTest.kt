package _01_ticket

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

internal class BagTest : DescribeSpec({
  describe("hold") {
    context("초대장이 없는 경우") {
      it("보유하고 있던 현금이 차감된다.") {
        val ticket = Ticket(fee = 100L)
        val bag = Bag(amount = 1000L)

        bag.hold(ticket)

        bag.amount shouldBe 900L
      }
    }
  }
})