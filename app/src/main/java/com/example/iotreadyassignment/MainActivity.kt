package com.example.iotreadyassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.viewbinding.ViewBinding
import com.example.iotreadyassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ViewBinding

    private lateinit var editTextPlu: EditText
    private lateinit var editTextTare: EditText
    private lateinit var editTextMrp: EditText
    private lateinit var editTextWeight: EditText
    private lateinit var editTextPrice: EditText

    private var editTextPluContent: String = ""
    private var editTextTareContent: String = ""
    private var editTextMrpContent: String = ""
    private var editTextWeightContent: String = ""
    private var editTextPriceContent: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        editTextPlu= findViewById(R.id.editTextPlu)
        editTextTare= findViewById(R.id.editTextTare)
        editTextMrp= findViewById(R.id.editTextMrp)
        editTextWeight= findViewById(R.id.editTextWeight)
        editTextPrice= findViewById(R.id.editTextPrice)



        // Restore the text if it was previously saved
        if (savedInstanceState != null) {
            editTextPluContent = savedInstanceState.getString("editTextContent", "")
            editTextTareContent = savedInstanceState.getString("editTextContent2", "")
            editTextMrpContent = savedInstanceState.getString("editTextMrp", "")
            editTextWeightContent = savedInstanceState.getString("editTextWeight", "")
            editTextPriceContent = savedInstanceState.getString("editTextPrice", "")

            editTextPlu.setText(editTextPluContent)
            editTextTare.setText(editTextTareContent)
            editTextMrp.setText(editTextMrpContent)
            editTextWeight.setText(editTextWeightContent)
            editTextPrice.setText(editTextPriceContent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // Save the text content
        editTextPluContent = editTextPlu.text.toString()
        editTextTareContent = editTextTare.text.toString()
        editTextMrpContent = editTextMrp.text.toString()
        editTextWeightContent = editTextWeight.text.toString()
        editTextPriceContent = editTextPrice.text.toString()

        outState.putString("editTextContent", editTextPluContent)
        outState.putString("editTextContent2", editTextTareContent)
        outState.putString("editTextMrp", editTextMrpContent)
        outState.putString("editTextWeight", editTextWeightContent)
        outState.putString("editTextPrice", editTextPriceContent)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        // Restore the text content
        editTextPluContent = savedInstanceState.getString("editTextContent", "")
        editTextPlu.setText(editTextPluContent)

        editTextTareContent = savedInstanceState.getString("editTextContent2", "")
        editTextTare.setText(editTextTareContent)

        editTextMrpContent = savedInstanceState.getString("editTextMrp", "")
        editTextMrp.setText(editTextMrpContent)

        editTextWeightContent = savedInstanceState.getString("editTextWeight", "")
        editTextWeight.setText(editTextWeightContent)

        editTextPriceContent = savedInstanceState.getString("editTextPrice", "")
        editTextPrice.setText(editTextPriceContent)
    }
}