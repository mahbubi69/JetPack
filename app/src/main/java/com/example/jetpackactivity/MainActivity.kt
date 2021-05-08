package com.example.jetpackactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackactivity.databinding.FragmentMainBinding
import com.example.jetpackactivity.fragment.RecipienFragment
import com.example.jetpackactivity.fragment.TransaksiFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTransaksi.setOnClickListener {
            bukaFragment()
        }
    }

    private fun bukaFragment() {
        val fragmentTransaksi = supportFragmentManager.beginTransaction()
        fragmentTransaksi.replace(R.id.frame_layout_binding, TransaksiFragment())
        fragmentTransaksi.disallowAddToBackStack()
        fragmentTransaksi.commit()
    }
}