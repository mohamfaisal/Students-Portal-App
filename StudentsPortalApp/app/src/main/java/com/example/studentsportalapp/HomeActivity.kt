package com.example.studentsportalapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.app.AlertDialog
import android.widget.ImageButton
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val sharedPref = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val userName = sharedPref.getString("userName", "Student")
        welcomeText.text = "Welcome, $userName"

        val noticeBtn = findViewById<ImageButton>(R.id.noticeButton)
        val timetableBtn = findViewById<ImageButton>(R.id.timetableButton)
        val profileBtn = findViewById<ImageButton>(R.id.profileButton)
        val logoutBtn = findViewById<Button>(R.id.logoutButton)


        noticeBtn.setOnClickListener {
            val intent = Intent(this, NoticesActivity::class.java)
            startActivity(intent)
        }

        timetableBtn.setOnClickListener {
            val intent = Intent(this, TimetableActivity::class.java)
            startActivity(intent)
        }

        profileBtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val gradesButton = findViewById<ImageButton>(R.id.gradesButton)
        val calendarButton = findViewById<ImageButton>(R.id.calendarButton)
        val eventsButton = findViewById<ImageButton>(R.id.eventsButton)

        gradesButton.setOnClickListener {
            val intent = Intent(this, GradesActivity::class.java)
            startActivity(intent)
        }

        calendarButton.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        eventsButton.setOnClickListener {
            val intent = Intent(this, EventsActivity::class.java)
            startActivity(intent)
        }


        logoutBtn.setOnClickListener {
            // Clear login flag from SharedPreferences
            val sharedPref = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putBoolean("isLoggedIn", false)
            editor.apply()

            // Navigate to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val helpBtn = findViewById<ImageButton>(R.id.helpBtn)
        helpBtn.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("How to Use the App")
                .setMessage(
                    "🔸 Use the Notices section to check university announcements.\n\n" +
                            "🔸 View your weekly classes in the Timetable tab.\n\n" +
                            "🔸 Your details are shown in the Profile section.\n\n" +
                            "🔸 More features will be added soon!"
                )
                .setPositiveButton("Got it") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }
}
