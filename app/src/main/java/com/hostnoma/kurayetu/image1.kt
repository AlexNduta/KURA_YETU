package com.hostnoma.kurayetu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image1, container, false)
    }
//we create a class that we will use later on in the mainActivity
//we pass the fragment layout resource file
class firstfragment: Fragment(R.layout.fragment_image1){

}
