package cubex.mahesh.not_vib_nov9am

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.support.v4.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var nManager = getSystemService(
                    Context.NOTIFICATION_SERVICE) as NotificationManager
            var nBuilder = NotificationCompat.Builder(
                    this@MainActivity,"and9am")
            nBuilder.setSmallIcon(R.drawable.ic_beach_access_black_24dp)
            nBuilder.setTicker("Sample Notification")
            nBuilder.setContentTitle("Android 9 AM November ")
            nBuilder.setContentText("This is a sample notification for demo")
            nBuilder.setAutoCancel(true)
            var i = Intent(this@MainActivity,
                    MainActivity::class.java)
            var pIntent = PendingIntent.getActivity(
                    this@MainActivity,0,
                    i,0)
            nBuilder.setContentIntent(pIntent)
            nManager.notify(++count,nBuilder.build())
        }

        button2.setOnClickListener {
                var vib = getSystemService(Context.VIBRATOR_SERVICE)
                            as Vibrator
                vib.vibrate(10000)
            
        }

    }
}
