package learn

fun main() {
    val month= Month.SEPTEMBER
    val season=when (month) {
       Month.DECEMBER, Month.JANUARY, Month.FEBRUARY->"WINTER"
        Month.MARCH, Month.APRIL, Month.MAY->"SPRING"
        Month.JUNE, Month.JULY, Month.AUGUST->"SUMMER"
        Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER->"AUTUMN"
    }
    println(season)
}