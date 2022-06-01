package _02_movie

import java.time.LocalDateTime

class Screening(private val movie: Movie, private val sequence: Int, private val whenScreened: LocalDateTime) {

    fun startTime() = whenScreened

    fun isSequence(sequence: Int) = this.sequence == sequence

    fun movieFee() = movie.fee

    fun calculateFee(audienceCount: Int) = movie.calculateMovieFee(this).times(audienceCount.toDouble())
}
