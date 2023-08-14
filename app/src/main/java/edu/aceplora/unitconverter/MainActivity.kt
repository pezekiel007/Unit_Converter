package edu.aceplora.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import edu.aceplora.unitconverter.conversions.DataActivity
import edu.aceplora.unitconverter.conversions.LengthActivity
import edu.aceplora.unitconverter.conversions.TemperatureActivity
import edu.aceplora.unitconverter.conversions.TimeActivity
import edu.aceplora.unitconverter.conversions.VolumeActivity
import edu.aceplora.unitconverter.conversions.WeightActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * TODO: FIND THE IMAGES BY THEIR ID's
         */
        val ivTime: ImageView = findViewById(R.id.ivTime)
        val ivLength: ImageView = findViewById(R.id.ivLength)
        val ivData: ImageView = findViewById(R.id.ivData)
        val ivWeight: ImageView = findViewById(R.id.ivWeight)
        val ivVolume: ImageView = findViewById(R.id.ivVolume)
        val ivTemp: ImageView = findViewById(R.id.ivTemp)

        /**
         * TODO: SET ON CLICK EVENTS IN THE IMAGES.
         * TODO: ADD FUNCTIONS TO MOVE TO THEIR DESIGNATED ACTIVITIES TO CONVERT
         */
        ivTime.setOnClickListener { startActivity(Intent(this, TimeActivity::class.java)) }
        ivLength.setOnClickListener { startActivity(Intent(this, LengthActivity::class.java)) }
        ivData.setOnClickListener { startActivity(Intent(this, DataActivity::class.java)) }
        ivWeight.setOnClickListener { startActivity(Intent(this, WeightActivity::class.java)) }
        ivVolume.setOnClickListener { startActivity(Intent(this, VolumeActivity::class.java)) }
        ivTemp.setOnClickListener { startActivity(Intent(this, TemperatureActivity::class.java)) }

    }
}
