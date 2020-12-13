package com.karve.gomysuru1.ui.contacts

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.karve.gomysuru1.R


class ContactsFragment : Fragment() {

    lateinit var buContactList : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_contacts, container, false)

        buContactList = root.findViewById(R.id.bu_more_contact)

        buContactList.setOnClickListener {
            val intent = Intent(context,ContactList::class.java)
            startActivity(intent)
        }
        return root
    }


}