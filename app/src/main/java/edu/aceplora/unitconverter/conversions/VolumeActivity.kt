package edu.aceplora.unitconverter.conversions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.aceplora.unitconverter.R

class VolumeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)
    }

    // TODO: LITRE TO ___
    // function to convert litre to centilitre
    private fun litreToCentilitre(litre: Double): Double {
        return litre * 100
    }

    // function to convert litre to millilitre
    private fun litreToMillilitre(litre: Double): Double {
        return litre * 1_000
    }

    // function to convert litre to centilitre
    private fun litreToCubicMeter(litre: Double): Double {
        return litre / 1_000
    }

    // TODO: MILLILITRE TO ___
    // function to convert millilitre to litre
    private fun millilitreToLitre(millilitre: Double): Double {
        return millilitre / 1_000
    }

    // function to convert millilitre to centilitre
    private fun millilitreToCentilitre(millilitre: Double): Double {
        return millilitre / 10
    }

    // function to convert millilitre to litre
    private fun millilitreToCubicMeter(millilitre: Double): Double {
        return millilitre / 1_000_000
    }

    // TODO: CENTILITRE TO ___
    // function to convert centilitre to litre
    private fun centilitreToLitre(centilitre: Double): Double {
        return centilitre / 100
    }

    // function to convert centilitre to millilitre
    private fun centilitreToMillilitre(centilitre: Double): Double {
        return centilitre * 10
    }

    // function to convert centilitre to cubic meter
    private fun centilitreToCubicMeter(centilitre: Double): Double {
        return centilitre / 100_000
    }

    // TODO: CUBIC METER TO ___
    // function to convert cubic meter to centilitre
    private fun cubicMeterToCentilitre(cubicMeter: Double): Double {
        return cubicMeter * 100_000
    }

    // function to convert cubic meter to litre
    private fun cubicMeterToLitre(cubicMeter: Double): Double {
        return cubicMeter * 1_000
    }

    // function to convert cubic meter to millilitre
    private fun cubicMeterToMillilitre(cubicMeter: Double): Double {
        return cubicMeter * 1_000_000
    }

}
