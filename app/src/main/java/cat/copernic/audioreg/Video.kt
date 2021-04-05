package cat.copernic.audioreg

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video.*

class Video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView1)

        val onlineURL = Uri.parse("https://dl8.webmfiles.org/big-buck-bunny_trailer.webm")

        videoView1.setMediaController(mediaController)
        videoView1.setVideoURI(onlineURL)
        videoView1.requestFocus()
        videoView1.start()
    }
}