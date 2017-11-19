package nl.appli.projectl

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.provider.MediaStore
import android.content.Intent
import android.graphics.Bitmap
import android.os.Environment
import android.support.v4.content.FileProvider
import android.widget.Button
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import android.widget.EditText
import android.widget.RadioButton
import com.google.firebase.database.DatabaseReference


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val newPieceNameView = findViewById<EditText>(R.id.new_piece_name) as EditText
        val newPieceBrandView = findViewById<EditText>(R.id.new_piece_brand) as EditText
        val newPieceSizeShirtView = findViewById<EditText>(R.id.new_piece_shirt_size) as EditText
        val newPieceSizePantWaistView = findViewById<EditText>(R.id.new_piece_pant_waist_size) as EditText
        val newPieceSizePantLengthView = findViewById<EditText>(R.id.new_piece_pant_length_size) as EditText
        newPieceNameView.visibility = View.INVISIBLE
        newPieceBrandView.visibility = View.INVISIBLE
        newPieceSizeShirtView.visibility = View.INVISIBLE
        newPieceSizePantWaistView.visibility = View.INVISIBLE
        newPieceSizePantLengthView.visibility = View.INVISIBLE
    }

    fun showInputShirt(view: View){
        val newPieceNameView = findViewById<EditText>(R.id.new_piece_name) as EditText
        val newPieceBrandView = findViewById<EditText>(R.id.new_piece_brand) as EditText
        val newPieceSizeShirtView = findViewById<EditText>(R.id.new_piece_shirt_size) as EditText
        val newPieceSizePantWaistView = findViewById<EditText>(R.id.new_piece_pant_waist_size) as EditText
        val newPieceSizePantLengthView = findViewById<EditText>(R.id.new_piece_pant_length_size) as EditText
        val checkedRadioButton = findViewById<RadioButton>(R.id.radio_select_pants) as RadioButton
        checkedRadioButton.isChecked = false;
        newPieceNameView.visibility = View.VISIBLE
        newPieceBrandView.visibility = View.VISIBLE
        newPieceSizeShirtView.visibility = View.VISIBLE
        newPieceSizePantWaistView.visibility = View.INVISIBLE
        newPieceSizePantLengthView.visibility = View.INVISIBLE

    }
    fun showInputPant(view: View){
        println("in show input function for SHIRT")
        val newPieceNameView = findViewById<EditText>(R.id.new_piece_name) as EditText
        val newPieceBrandView = findViewById<EditText>(R.id.new_piece_brand) as EditText
        val newPieceSizeShirtView = findViewById<EditText>(R.id.new_piece_shirt_size) as EditText
        val newPieceSizePantWaistView = findViewById<EditText>(R.id.new_piece_pant_waist_size) as EditText
        val newPieceSizePantLengthView = findViewById<EditText>(R.id.new_piece_pant_length_size) as EditText
        val checkedRadioButton = findViewById<RadioButton>(R.id.radio_select_shirt) as RadioButton
        checkedRadioButton.isChecked = false;
        newPieceNameView.visibility = View.VISIBLE
        newPieceBrandView.visibility = View.VISIBLE
        newPieceSizePantWaistView.visibility = View.VISIBLE
        newPieceSizePantLengthView.visibility = View.VISIBLE
        newPieceSizeShirtView.visibility = View.INVISIBLE
    }




    fun loadDatabase(firebaseData: DatabaseReference) {


        val availableSalads: List<User> = mutableListOf(
                User("Lisanne", "l@l.com"),
                User("user2", "user2@2.com")
        )
        availableSalads.forEach {
            val key = firebaseData.child("users").push().key
           // it.uuid = key
            firebaseData.child("salads").child(key).setValue(key)
        }
    }


/*    val REQUEST_IMAGE_CAPTURE = 1
    val REQUEST_TAKE_PHOTO = 1

    fun takePicture(view: View){
        dispatchTakePictureIntent()
    }


    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        // Ensure that there's a camera activity to handle the intent
        if (takePictureIntent.resolveActivity(getPackageManager()) != null)
        {
            // Create the File where the photo should go
            println("in eerste if!")
            var photoFile:File? = null
            try
            {
                photoFile = createImageFile()
            }
            catch (ex:IOException) {}// Error occurred while creating the File
            // Continue only if the File was successfully created
            if (photoFile != null)
            {
                println("tweede if: photofile is niet null")
                println(photoFile)
                val photoURI = FileProvider.getUriForFile(this,
                        "com.example.android.fileprovider",
                        photoFile)
                println("after photoUri definition")
                println(photoURI)
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            println("Result is OK!!!")
            val extras = data.extras
            val imageBitmap = extras!!.get("data") as Bitmap
          //  mImageView.setImageBitmap(imageBitmap)
        }
    }

    var mCurrentPhotoPath: String = ""

    @Throws(IOException::class)
    private fun createImageFile(): File {
        // Create an image file name
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val imageFileName = "JPEG_" + timeStamp + "_"
        val storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        val image = File.createTempFile(
                imageFileName, */
/* prefix *//*

                ".jpg", */
/* suffix *//*

                storageDir      */
/* directory *//*

        )

        // Save a file: path for use with ACTION_VIEW intents
        mCurrentPhotoPath = image.getAbsolutePath()
        return image
    }
*/



}
