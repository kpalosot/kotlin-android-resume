package kyla.palos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistory)
        workHistory.setOnClickListener {
            println("Hey you hit the button!")
            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var callKyla = findViewById<Button>(R.id.callKyla)
        callKyla.setOnClickListener {
            println("You hit the call button!")
        }
    }
}
