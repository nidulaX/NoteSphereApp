package com.example.notebook

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notebook.databinding.ActivityNewNoteBinding

class NewNote : AppCompatActivity() {

    private lateinit var binding: ActivityNewNoteBinding
    private lateinit var db: NoteDatabaseHelp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = NoteDatabaseHelp(this)

        binding.saveNoteBtn.setOnClickListener{
            val title = binding.editTxtTitle.text.toString()
            val content = binding.editTxtContent.text.toString()
            val note = Note(0, title, content)
            db.insertNote(note)
            finish()
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()

        }

    }
}