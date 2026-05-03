package com.example.myapplicationexampleone

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var seasonSpinner: Spinner
    private lateinit var musicSpinner: Spinner
    private lateinit var timeSpinner: Spinner
    private lateinit var generateButton: Button
    private lateinit var vibeImage: ImageView
    private lateinit var vibeDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Setup UI Elements
        seasonSpinner = findViewById(R.id.spinnerSeason)
        musicSpinner = findViewById(R.id.spinnerMusic)
        timeSpinner = findViewById(R.id.spinnerTime)
        generateButton = findViewById(R.id.generateButton)
        vibeImage = findViewById(R.id.vibeImage)
        vibeDescription = findViewById(R.id.vibeDescription)

        // Spinner options
        val seasons = arrayOf("Spring", "Summer", "Autumn", "Winter")
        val music = arrayOf("Lo-fi", "Jazz", "Pop", "Classical")
        val times = arrayOf("Morning", "Afternoon", "Evening", "Night")

        seasonSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, seasons)
        musicSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, music)
        timeSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, times)

        generateButton.setOnClickListener {
            val selectedSeason = seasonSpinner.selectedItem.toString()
            val selectedMusic = musicSpinner.selectedItem.toString()
            val selectedTime = timeSpinner.selectedItem.toString()

            generateVibe(selectedSeason, selectedMusic, selectedTime)

        }

        val infoButton: Button = findViewById(R.id.infoButton)

        infoButton.setOnClickListener {
            val builder = android.app.AlertDialog.Builder(this)
            builder.setTitle("How to Use the Vibe Calculator")
            builder.setMessage(
                """
        1. Select a Season (Spring, Summer, etc.)
        2. Choose a Music Genre (Lo-fi, Jazz, etc.)
        3. Pick a Time of Day
        4. Tap "Generate Vibe"
        
        You'll get a vibe description and image based on your mood! ✨
        """.trimIndent()
            )
            builder.setPositiveButton("Got it!") { dialog, _ ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }

    }

    private fun generateVibe(season: String, music: String, time: String) {
        val vibeDescription: String
        val imageResId: Int

        when {
            season == "Spring" && music == "Lo-fi" && time == "Morning" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.a
            }
            season == "Spring" && music == "Lo-fi" && time == "Afternoon" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.vibe_spring_rock_afternoon
            }
            season == "Spring" && music == "Lo-fi" && time == "Evening" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.b
            }
            season == "Spring" && music == "Lo-fi" && time == "Night" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.c
            }
            season == "Spring" && music == "Jazz" && time == "Morning" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.d
            }
            season == "Spring" && music == "Jazz" && time == "Afternoon" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.e
            }
            season == "Spring" && music == "Jazz" && time == "Evening" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.f
            }
            season == "Spring" && music == "Jazz" && time == "Night" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.a
            }
            season == "Spring" && music == "Pop" && time == "Morning" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.b
            }
            season == "Spring" && music == "Pop" && time == "Afternoon" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.c
            }
            season == "Spring" && music == "Pop" && time == "Evening" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.d
            }
            season == "Spring" && music == "Pop" && time == "Night" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.vibe_spring_rock_afternoon
            }
            season == "Spring" && music == "Classical" && time == "Morning" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.e
            }
            season == "Spring" && music == "Classical" && time == "Afternoon" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.b
            }
            season == "Spring" && music == "Classical" && time == "Evening" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.c
            }
            season == "Spring" && music == "Classical" && time == "Night" -> {
                vibeDescription = "Fresh air and loud chords 🌸🎸"
                imageResId = R.drawable.a
            }
            season == "Summer" && music == "Pop" && time == "Morning" -> {
                vibeDescription = "You’re a sunny pop daydream 🌞🎶"
                imageResId = R.drawable.a
            }
            season == "Summer" && music == "Pop" && time == "Afternoon" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.b
            }
            season == "Summer" && music == "Pop" && time == "Evening" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.c
            }
            season == "Summer" && music == "Pop" && time == "Night" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.d
            }
            season == "Summer" && music == "Jazz" && time == "Morning" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.e
            }
            season == "Summer" && music == "Jazz" && time == "Afternoon" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.f
            }
            season == "Summer" && music == "Jazz" && time == "Evening" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.a
            }
            season == "Summer" && music == "Jazz" && time == "Night" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.b
            }
            season == "Summer" && music == "Lo-fi" && time == "Morning" -> {
                vibeDescription = "You’re a sunny Lo-fi daydream 🌞🎶"
                imageResId = R.drawable.c
            }
            season == "Summer" && music == "Lo-fi" && time == "Afternoon" -> {
                vibeDescription = "You’re a sunny Lo-fi daydream 🌞🎶"
                imageResId = R.drawable.d
            }
            season == "Summer" && music == "Lo-fi" && time == "Evening" -> {
                vibeDescription = "You’re a sunny Lo-fi daydream 🌞🎶"
                imageResId = R.drawable.e
            }
            season == "Summer" && music == "Lo-fi" && time == "Night" -> {
                vibeDescription = "You’re a sunny Lo-fi daydream 🌞🎶"
                imageResId = R.drawable.f
            }
            season == "Summer" && music == "Classical" && time == "Morning" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.a
            }
            season == "Summer" && music == "Classical" && time == "Afternoon" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.vibe_summer_pop_day
            }
            season == "Summer" && music == "Classical" && time == "Evening" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.vibe_summer_pop_day
            }
            season == "Summer" && music == "Classical" && time == "Night" -> {
                vibeDescription = "You’re a sunny daydream 🌞🎶"
                imageResId = R.drawable.c
            }
            season == "Autumn" && music == "Lo-fi" && time == "Morning" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.a
            }
            season == "Autumn" && music == "Lo-fi" && time == "Afternoon" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.b
            }
            season == "Autumn" && music == "Lo-fi" && time == "Evening" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.vibe_autumn_classical_evening
            }
            season == "Autumn" && music == "Lo-fi" && time == "Night" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.c
            }
            season == "Autumn" && music == "Jazz" && time == "Morning" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.d
            }
            season == "Autumn" && music == "Jazz" && time == "Afternoon" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.e
            }
            season == "Autumn" && music == "Jazz" && time == "Evening" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.vibe_autumn_classical_evening
            }
            season == "Autumn" && music == "Jazz" && time == "Night" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.f
            }
            season == "Autumn" && music == "Pop" && time == "Morning" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.a
            }
            season == "Autumn" && music == "Pop" && time == "Afternoon" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.b
            }
            season == "Autumn" && music == "Pop" && time == "Evening" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.c
            }
            season == "Autumn" && music == "Pop" && time == "Night" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.d
            }
            season == "Autumn" && music == "Classical" && time == "Morning" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.a
            }
            season == "Autumn" && music == "Classical" && time == "Afternoon" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.b
            }
            season == "Autumn" && music == "Classical" && time == "Evening" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.c
            }
            season == "Autumn" && music == "Classical" && time == "Night" -> {
                vibeDescription = "Golden leaves and violins 🍂🎻"
                imageResId = R.drawable.d
            }
            season == "Winter" && music == "Lo-fi" && time == "Morning" -> {
                vibeDescription = "Cozy winter lo-fi night ❄️🎧"
                imageResId = R.drawable.e
            }
            season == "Winter" && music == "Lo-fi" && time == "Afternoon" -> {
                vibeDescription = "Cozy winter lo-fi night ❄️🎧"
                imageResId = R.drawable.f
            }
            season == "Winter" && music == "Lo-fi" && time == "Evening" -> {
                vibeDescription = "Cozy winter lo-fi night ❄️🎧"
                imageResId = R.drawable.a
            }
            season == "Winter" && music == "Lo-fi" && time == "Night" -> {
                vibeDescription = "Cozy winter lo-fi night ❄️🎧"
                imageResId = R.drawable.vibe_winter_lofi_night
            }
            season == "Winter" && music == "Jazz" && time == "Morning" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.b
            }
            season == "Winter" && music == "Jazz" && time == "Afternoon" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.c
            }
            season == "Winter" && music == "Jazz" && time == "Evening" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.d
            }
            season == "Winter" && music == "Jazz" && time == "Night" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.vibe_winter_lofi_night
            }
            season == "Winter" && music == "Pop" && time == "Morning" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.e
            }
            season == "Winter" && music == "Pop" && time == "Afternoon" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.f
            }
            season == "Winter" && music == "Pop" && time == "Evening" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.a
            }
            season == "Winter" && music == "Pop" && time == "Night" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.vibe_winter_lofi_night
            }
            season == "Winter" && music == "Classical" && time == "Morning" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.b
            }
            season == "Winter" && music == "Classical" && time == "Afternoon" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.c
            }
            season == "Winter" && music == "Classical" && time == "Evening" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.d
            }
            season == "Winter" && music == "Classical" && time == "Night" -> {
                vibeDescription = "Cozy winter night ❄️🎧"
                imageResId = R.drawable.e
            }
            season == "Rainy" && music == "Jazz" && time == "Morning" -> {
                vibeDescription = "Raindrops and saxophones ☔🎷"
                imageResId = R.drawable.vibe_rainy_jazz_morning
            }
            season == "Fantasy" && music == "Chill" && time == "Midnight" -> {
                vibeDescription = "Dreamy vibes under the stars 🌌✨"
                imageResId = R.drawable.vibe_fantasy_chill_midnight
            }
            else -> {
                vibeDescription = "You're a unique vibe! 🎨"
                imageResId = R.drawable.default_vibe // fallback image
            }
        }

        val imageView: ImageView = findViewById(R.id.vibeImage)
        val textView: TextView = findViewById(R.id.vibeDescription)

        imageView.setImageResource(imageResId)
        textView.text = vibeDescription
    }

}
