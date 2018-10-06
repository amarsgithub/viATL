package com.example.amars.viatl;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
//import com.google.android.gms.tasks.OnFailureListener;
//import com.google.android.gms.tasks.OnSuccessListener;
//import com.google.firebase.storage.FirebaseStorage;
//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.InputStream;


//public static final int GALLERY_REQUEST =1;
public class MainActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;

    private Button mButtonChooseImage;
    private Button mButtonUpload;
    private TextView mTextViewShowUploads;
    private EditText mEditTextFileName;
    private ImageView mImageView;
    private ProgressBar mProgressBar;

    private Uri mImageUri;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        mButtonChooseImage = findViewById(R.id.button_choose_image);
//        mButtonUpload = findViewById(R.id.button_upload);
//        mTextViewShowUploads = findViewById(R.id.text_view_show_uploads);
//        mEditTextFileName = findViewById(R.id.edit_text_file_name);
//        mImageView = findViewById(R.id.image_view);
//        mProgressBar = findViewById(R.id.progress_bar);
//
//        mButtonChooseImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openFileChoose();
//            }
//        });
//
//        mButtonUpload.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        mTextViewShowUploads.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
    }
//
//    private void openFileChoose()
//    {
//        Intent intent = new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//        startActivityForResult(intent, PICK_IMAGE_REQUEST);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
//                && data != null && data.getData() != null)
//            mImageUri = data.getData();
//        }
//
//    }

//    public void PhotoList(View view) {
////        Intent intent = new Intent(this, Photo_List.class);
////        startActivity(intent);
//        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
//        photoPickerIntent.setType("image/*");
//        startActivityForResult(photoPickerIntent, GALLERY_REQUEST);
//    }
//
//    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
//        super.onActivityResult(reqCode, resultCode, data);
//
//
//        if (resultCode == RESULT_OK) {
//            try {
//                final Uri imageUri = data.getData();
//                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
//                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
//                image_view.setImageBitmap(selectedImage);
//            } catch (FilzeNotFoundException e) {
//                e.printStackTrace();
//                Toast.makeText(PostImage.this, "Something went wrong", Toast.LENGTH_LONG).show();
//            }
//
//        }else {
//            Toast.makeText(PostImage.this, "You haven't picked Image",Toast.LENGTH_LONG).show();
//        }
//    }
}
