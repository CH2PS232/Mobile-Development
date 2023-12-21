package com.nizarmaulana.capstone1.ui.main

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nizarmaulana.capstone1.R

class CustomSpinnerAdapter(
    context: Context,
    resource: Int,
    private val objects: Array<String>,
    private var selectedGender: String
): ArrayAdapter<String>(context, resource, objects) {

    fun setSelectedGender(gender: String) {
        selectedGender = gender
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getDropDownView(position, convertView, parent) as TextView

        if (getItem(position) == selectedGender) {
            if (selectedGender == "Female") {
                view.setBackgroundColor(context.resources.getColor(R.color.colorBlue))
            } else if (selectedGender == "Male") {
                view.setBackgroundColor(context.resources.getColor(R.color.colorBlue))
            }
        } else {
            view.setBackgroundColor(context.resources.getColor(android.R.color.white))
        }

        return view
    }
}