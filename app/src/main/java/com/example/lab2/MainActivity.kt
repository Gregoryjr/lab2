package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.R


class MainActivity : AppCompatActivity() {
    lateinit var emails: MutableList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ubutt = findViewById<Button>(R.id.ubutton)
        val  ifield = findViewById<EditText>(R.id.inputfield)
        val  ifield2 = findViewById<EditText>(R.id.inputfield2)

        // Lookup the RecyclerView in activity layout
        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)
        // Fetch the list of emails
        emails = EmailFetcher.getEmails()
        // Create adapter passing in the list of emails
        val adapter = EmailAdapter(emails)
        // Attach the adapter to the RecyclerView to populate items
        emailsRv.adapter = adapter
        // Set layout manager to position the items
        emailsRv.layoutManager = LinearLayoutManager(this)





        ubutt.setOnClickListener {
            var inputt2  = ifield2.text.toString().toUpperCase()
            var inputt  = ifield.text.toString().toUpperCase()
            val email = Email(inputt, inputt2)
            emails.add(email)
            adapter.notifyDataSetChanged()
        }






    }






    }
