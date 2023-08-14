package edu.aceplora.unitconverter.conversions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.aceplora.unitconverter.R

class TemperatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature)
    }

    // function to convert celsius to fahrenheit
    private fun celsiusToFahrenheit(celsius: Double): Double {
        return (celsius * 1.8) + 32
    }

    // function to convert celsius to kelvin
    private fun celsiusToKelvin(celsius: Double): Double {
        return celsius + 273.15
    }

    // function to convert fahrenheit to celsius
    private fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * (5 / 9)
    }

    // function to convert fahrenheit to kelvin
    private fun fahrenheitToKelvin(fahrenheit: Double): Double {
        return (fahrenheit - 32) * (5 / 9) * 273.15
    }

    // function to convert kelvin to celsius
    private fun kelvinToCelsius(kelvin: Double): Double {
        return kelvin - 273.15
    }

    // function to convert kelvin to fahrenheit
    private fun kelvinToFahrenheit(kelvin: Double): Double {
        return (kelvin - 273.15) * 1.8 + 32
    }

}
