package edu.aceplora.unitconverter.conversions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.aceplora.unitconverter.R

class LengthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)
    }

    // TODO: METERS TO ___
    // function to convert meter to centimeter
    private fun meterToCentimeter(meter: Double): Double {
        return meter * 100
    }

    // function to convert meter to feet
    private fun meterToFeet(meter: Double): Double {
        return meter * 3.281
    }

    // function to convert meter to inch
    private fun meterToInch(meter: Double): Double {
        return meter * 39.37
    }

    // TODO: CENTIMETERS TO ___
    // function to convert centimeter to meter
    private fun centimeterToMeter(centimeter: Double): Double {
        return centimeter / 100
    }

    // function to convert centimeter to feet
    private fun centimeterToFeet(centimeter: Double): Double {
        return centimeter / 30.48
    }

    // function to convert centimeter to inch
    private fun centimeterToInch(centimeter: Double): Double {
        return centimeter / 2.54
    }

    // TODO: INCH TO ___
    // function to convert inch to centimeter
    private fun inchToCentimeter(inch: Double): Double {
        return inch * 2.54
    }

    // function to convert inch to centimeter
    private fun inchToFeet(inch: Double): Double {
        return inch * 12.0
    }

    // function to convert inch to centimeter
    private fun inchToMeter(inch: Double): Double {
        return inch * 39.37
    }

    // TODO: FEET TO ___
    // function to convert feet to inch
    private fun feetToInch(feet: Double): Double {
        return feet * 12.0
    }

    // function to convert feet to meter
    private fun feetToMeter(feet: Double): Double {
        return feet / 3.281
    }

    // function to convert feet to centimeter
    private fun feetToCentimeter(feet: Double): Double {
        return feet * 30.48
    }

}