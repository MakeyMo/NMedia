package logicFunctions

open class NumericHandlers {

    fun countersSimpleView(counter: Int): String {
        var result: Int
        var remainder: Int
        var remaindersFirstChar: String

        if (counter / 1000000 != 0 ) {
            result = counter / 1000000
            remainder = counter % 1000000
            if (remainder < 100000) {
                return "$result M"
            } else
                remaindersFirstChar = remainder.toString().take(1)
            return "$result.$remaindersFirstChar M"
        }

        if (counter / 10000 != 0 ) {
            result = counter / 1000
            return "$result K"
        }

        if (counter / 1000 != 0 ) {
            result = counter / 1000
            remainder = counter % 1000
            if (remainder < 100) {
                return "$result K"
            } else
                remaindersFirstChar = remainder.toString().take(1)
            return "$result.$remaindersFirstChar K"
        }

        return counter.toString()
    }
}