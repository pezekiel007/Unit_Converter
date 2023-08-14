package edu.aceplora.unitconverter.conversions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.aceplora.unitconverter.R

class TimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
    }

    // TODO: SECOND TO ___
    // function to convert seconds to minute
    private fun secondToMinute(second: Double): Double {
        return second / 60
    }

    // function to convert seconds to hour
    private fun secondToHour(second: Double): Double {
        return second / 3_600
    }

    // function to convert seconds to days
    private fun secondToDays(second: Double): Double {
        return second / 86_400
    }

    // function to convert seconds to week
    private fun secondToWeek(second: Double): Double {
        return second / 604_800
    }

    // function to convert seconds to month
    private fun secondToMonth(second: Double): Double {
        return second / 2_628_000
    }

    // TODO: MINUTE TO ___
    // function to convert minute to seconds
    private fun minuteToSecond(minute: Double): Double {
        return minute * 60
    }

    // function to convert minute to hour
    private fun minuteToHour(minute: Double): Double {
        return minute / 60
    }

    // function to convert minute to days
    private fun minuteToDay(minute: Double): Double {
        return minute / 1_440
    }

    // function to convert minute to weeks
    private fun minuteToWeek(minute: Double): Double {
        return minute / 10_080
    }

    // function to convert minute to months
    private fun minuteToMonth(minute: Double): Double {
        return minute * 43_800
    }

    // TODO: HOUR TO ___
    // function to convert hour to seconds
    private fun hourToSecond(hour: Double): Double {
        return hour * 3_600
    }

    // function to convert hour to minutes
    private fun hourToMinute(hour: Double): Double {
        return hour * 60
    }

    // function to convert hour to days
    private fun hourToDays(hour: Double): Double {
        return hour * hour / 24
    }

    // function to convert hour to week
    private fun hourToWeek(hour: Double): Double {
        return hour * hour / 168
    }

    // function to convert hour to months
    private fun hourToMonths(hour: Double): Double {
        return hour * hour / 730
    }

    // TODO: DAYS TO ___
    // function to convert days to seconds
    private fun dayToSecond(day: Double): Double {
        return day * 86_400
    }

    // function to convert days to minutes
    private fun dayToMinute(day: Double): Double {
        return day * 1_440
    }

    // function to convert days to hours
    private fun dayToHour(day: Double): Double {
        return day * 24
    }

    // function to convert days to weeks
    private fun dayToWeek(day: Double): Double {
        return day / 7
    }

    // function to convert days to months
    private fun dayToMonth(day: Double): Double {
        return day / 30.417
    }

    // TODO: WEEKS TO ___
    // function to convert weeks to seconds
    private fun weekToSecond(week: Double): Double {
        return week * 604_800
    }

    // function to convert weeks to minutes
    private fun weekToMinute(week: Double): Double {
        return week * 10_080
    }

    // function to convert weeks to hours
    private fun weekToHour(week: Double): Double {
        return week * 168
    }

    // function to convert weeks to days
    private fun weekToDay(week: Double): Double {
        return week * 7
    }

    // function to convert weeks to months
    private fun weekToMonth(week: Double): Double {
        return week / 4.345
    }

    // TODO: MONTHS TO ___
    // function to convert months to seconds
    private fun monthToSecond(month: Double): Double {
        return month * 2_628_000
    }

    // function to convert months to minutes
    private fun monthToMinutes(month: Double): Double {
        return month * 43_800
    }

    // function to convert months to hours
    private fun monthToHours(month: Double): Double {
        return month * 730
    }

    // function to convert months to days
    private fun monthToDays(month: Double): Double {
        return month * 30.417
    }

    // function to convert months to weeks
    private fun monthToWeek(month: Double): Double {
        return month * 4.345
    }

}
