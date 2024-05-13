package com.example.notebook

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notebook.databinding.ActivityUpdateNoteBinding

class UpdateNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateNoteBinding
    private lateinit var db : NoteDatabaseHelp
    private var noteId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = NoteDatabaseHelp(this)

        noteId = intent.getIntExtra("note_id", -1)
        if(noteId == -1){
            finish()
            return
        }

        val note = db.getNoteByID(noteId)
        binding.UpdateEditTxtTitle.setText(note.title)
        binding.UpdateEditTxtContent.setText(note.content)

        binding.updateSaveNoteBtn.setOnClickListener {
            val newTitle = binding.UpdateEditTxtTitle.text.toString()
            val newContent = binding.UpdateEditTxtContent.text.toString()
            val updatedNote = Note(noteId, newTitle, newContent)
            db.updateNote(updatedNote)
            finish()
            Toast.makeText(this, "Saved Changes", Toast.LENGTH_SHORT).show()
        }

    }
}