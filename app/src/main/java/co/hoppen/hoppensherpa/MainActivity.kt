package co.hoppen.hoppensherpa

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    private var recognizer : OnlineRecognizer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        initModel()
    }

//    private fun initModel(){
//        val config = OnlineRecognizerConfig(
//            featConfig = getFeatureConfig(16000,80),
//            modelConfig = getModelConfig(type = 9)!!,
//            endpointConfig = getEndpointConfig(),
//            enableEndpoint = true,
//            maxActivePaths = 0,
//            hotwordsScore = 0.0f,
//            blankPenalty = 0.0f,
//        )
//        recognizer = OnlineRecognizer(assetManager = application.assets,config)
//    }

}