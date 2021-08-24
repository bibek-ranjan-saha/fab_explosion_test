package com.crazylab.fabexplosiontest

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var fab:FloatingActionButton
    lateinit var circle: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amimation = AnimationUtils.loadAnimation(this,R.anim.explode).apply {
            duration = 700
            interpolator = AccelerateInterpolator()
        }

        fab = findViewById(R.id.fab_exp)
        circle = findViewById(R.id.circle_view)

        fab.setOnClickListener {
            fab.isVisible = false
            circle.isVisible = false
            circle.startAnimation(amimation);
            {
                //display your fragment

            }
        }
    }

    fun show_d(view: View) {
        val popup= MaterialAlertDialogBuilder(this)
        var dialog: AlertDialog?=null
        when(view.id)
        {
            R.id.button ->
            {
                val viewd:View= layoutInflater.inflate(R.layout.apply_pop,null)

                var close = viewd.findViewById<ImageButton>(R.id.close_btn)
                var issue_txt = viewd.findViewById<TextInputEditText>(R.id.txt_issue)
                var apply_btn = viewd.findViewById<Button>(R.id.btn_apply)

                close.setOnClickListener{
                    dialog?.cancel()
                }
                popup.background = ColorDrawable(Color.TRANSPARENT)
                popup.setView(viewd).create()
            }R.id.button1 ->
            {
                val viewd:View= layoutInflater.inflate(R.layout.view_issue_item,null)

//                var close = viewd.findViewById<ImageButton>(R.id.closer_btn)
//                var good = viewd.findViewById<ImageView>(R.id.good_rate)
//                var better = viewd.findViewById<ImageView>(R.id.better_rate)
//                var best = viewd.findViewById<ImageView>(R.id.best_rate)
//                var continue_btn = viewd.findViewById<Button>(R.id.btn_continue)
//                var cancel_btn = viewd.findViewById<Button>(R.id.btn_cancel)
//
//                close.setOnClickListener{
//                    dialog?.cancel()
//                }
                popup.background = ColorDrawable(Color.TRANSPARENT)
                popup.setView(viewd).create()
            }R.id.button2 ->
            {
                val viewd:View= layoutInflater.inflate(R.layout.assigned_issue_item,null)

//                var close = viewd.findViewById<ImageButton>(R.id.close_btn)
//                var issue_txt = viewd.findViewById<TextInputEditText>(R.id.txt_issue)
//                var apply_btn = viewd.findViewById<Button>(R.id.btn_apply)
//
//                close.setOnClickListener{
//                    dialog?.cancel()
//                }
                popup.background = ColorDrawable(Color.TRANSPARENT)
                popup.setView(viewd).create()
            }R.id.button3 ->
            {
                val viewd:View= layoutInflater.inflate(R.layout.rating_work,null)

                var close = viewd.findViewById<ImageButton>(R.id.closer_btn)
                var good = viewd.findViewById<ImageView>(R.id.good_rate)
                var better = viewd.findViewById<ImageView>(R.id.better_rate)
                var best = viewd.findViewById<ImageView>(R.id.best_rate)
                var bar = viewd.findViewById<LinearProgressIndicator>(R.id.rating_bar)
                var continue_btn = viewd.findViewById<Button>(R.id.btn_continue)
                var cancel_btn = viewd.findViewById<Button>(R.id.btn_cancel)

                close.setOnClickListener{
                    dialog?.cancel()
                }

                good.setOnClickListener {

                }
                better.setOnClickListener {

                }
                best.setOnClickListener {

                }

                continue_btn.setOnClickListener{
                    Snackbar.make(viewd,"clicked on continue",Snackbar.LENGTH_SHORT).show()
                }

                cancel_btn.setOnClickListener{
                    Snackbar.make(viewd,"clicked on continue",Snackbar.LENGTH_SHORT).show()
                }

                popup.background = ColorDrawable(Color.TRANSPARENT)
                popup.setView(viewd).create()
            }
        }
        popup.setCancelable(false)
        dialog?.setCancelable(false)
        dialog=popup.show()
//        dialog.show()
    }
}