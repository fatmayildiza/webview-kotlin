package com.fyildiza.apifya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.fyildiza.apifya.databinding.ActivityMainBinding
private lateinit var binding:ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        binding.mwebview.loadUrl("https://www.dersinnova.com")
        val websetting= binding.mwebview.settings

        //webview ayarlarımızı kullanabilmemiz için

        websetting.builtInZoomControls=true

        //örneğin uygulamamıza zoom özelliği eklemek istiyorsak                                                                              kullanabiliriz.
        websetting.javaScriptEnabled= true

        //Sayfamızda JS kodları varsa bu metodu etkinleştirmemiz   gerekiyor. Yoksa JS kodlarımız çalışmayacaktır.



        binding.mwebview.webViewClient= WebViewClient()
        // Bu sınıf sayfanızın yüklenmesi sürecini yönetmenize olanak tanır.
    }

    override fun onBackPressed() {
        if (binding.mwebview.canGoBack())
            binding.mwebview.goBack()
        super.onBackPressed()
    }






}