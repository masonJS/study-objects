package _02_movie

import java.math.BigDecimal

class Money(private val amount: BigDecimal) {

    fun plus(money: Money) = Money(amount.add(money.amount))

    fun minus(money: Money) = Money(amount.subtract(money.amount))

    fun times(percent: Double) = Money(amount.multiply(BigDecimal.valueOf(percent)))

    fun isLessThen(other: Money): Boolean = amount < other.amount

    fun isGreaterThenOrEqual(other: Money): Boolean = amount >= other.amount

    companion object {
        val ZERO: Money = Money.wons(0)

        fun wons(amount: Long) = Money(BigDecimal.valueOf(amount))

        fun wons(amount: Double) = Money(BigDecimal.valueOf(amount))
    }
}
