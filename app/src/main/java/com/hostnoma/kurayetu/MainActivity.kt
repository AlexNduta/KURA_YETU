package com.hostnoma.kurayetu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //we create a new variable(firstfragment) that is initialised to the class(firstfragment()) we created in the fragmentcode
        //also remmember that the firstfragmentclass had the fragment layout passed through it as a parameter
        //this means that the variable(firstfragment) carries all the properties and functions of the class
        val firstfragment=firstfragment()
        //we pass the firstfragment variable as the parameter that is supposed to replace the flFragment layout we created earlier
        setcurrentFragment(firstfragment)



    }
    // THE HOME MENU NAV CODE
    // we create a set current fragment function
    //the function takes fragment which is of type Fragment as a parameter
    //the functin is initialised to the supportFragmentmanager method
    //we have to apply
    private fun setcurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            //we are replacing the flFragment with the new fragment we've just created
            replace(R.id.flFragment, fragment)
            //this activates the process
            commit()
        }
// the toolbar code
    //we override the createOptionsmenue function that returns a boolean value
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    //we specify our own menu using the menu inflator
    // we pass the menu resource file and the menu passed at the onCreateOptionsmenue as our parameters
    menuInflater.inflate(R.menu.top_nav_menu, menu)
    // because we are supposed to return a boolean value, this "true" means that we have succesfully inflated our menu
        return true
    }
//onclick click listener code on our toolbar
    // we pass the items of the menu toolbar as parameters
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
    //when an item of a specific item Id is clicked
    when(item.itemId){
        //when an item icon is clicked, a toast appears
     R.id.m2profile-> Toast.makeText(this, "you clicked on the profile", Toast.LENGTH_SHORT).show()
    R.id.m2feedback -> Toast.makeText(this, "you clicked on the feedback option", Toast.LENGTH_SHORT).show()
    R.id.m2settings -> Toast.makeText(this, "you clicked on the settings options", Toast.LENGTH_SHORT).show()
    R.id.m2exit -> finish()
        }
        return true
    }
}