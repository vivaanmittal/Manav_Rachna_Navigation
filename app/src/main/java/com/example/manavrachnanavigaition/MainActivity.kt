package com.example.manavrachnanavigaition

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.drawable.manav_logo)
        supportActionBar?.elevation = 0F
        setContentView(R.layout.activity_main)

        var cen_lib_nav_but : Button = findViewById(R.id.Cen_lib)
        cen_lib_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450154367951384, 77.28704922274208&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var a_nav_but : Button = findViewById(R.id.a_block)
        a_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450793451967776, 77.28366759750241&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var b_nav_but : Button = findViewById(R.id.b_block)
        b_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.45013163462159, 77.28365578499523&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var c_nav_but : Button = findViewById(R.id.c_block)
        c_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.4496651971901, 77.28341067007723&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var d_nav_but : Button = findViewById(R.id.d_block)
        d_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450579956221006, 77.28356896679655&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var e_nav_but : Button = findViewById(R.id.e_block)
        e_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.45102716234241, 77.2842140150177&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var f_nav_but : Button = findViewById(R.id.f_block)
        f_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.451046964191335, 77.28462817097606&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var g_nav_but : Button = findViewById(R.id.g_block)
        g_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.449968440334807, 77.28518930985307&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var h_nav_but : Button = findViewById(R.id.h_block)
        h_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.44987418856376, 77.28564268793161&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var i_nav_but : Button = findViewById(R.id.i_block)
        i_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.44995038125911, 77.28588239982813&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var j_nav_but : Button = findViewById(R.id.j_block)
        j_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.449899385320148, 77.28626554581328&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var k_nav_but : Button = findViewById(R.id.k_block)
        k_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450355539340695, 77.28519940657421&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var l_nav_but : Button = findViewById(R.id.l_block)
        l_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450520618754453, 77.28516185564834&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var m_nav_but : Button = findViewById(R.id.m_block)
        m_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.451033037762855, 77.28545046001268&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var n_nav_but : Button = findViewById(R.id.n_block)
        n_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.451033037762855, 77.28545046001268&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var o_nav_but : Button = findViewById(R.id.o_block)
        o_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.451189743402555, 77.28635325354512&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var p_nav_but : Button = findViewById(R.id.p_block)
        p_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.45048278937353, 77.28644443260562&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var q_nav_but : Button = findViewById(R.id.q_block)
        q_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450937742939256, 77.28729263040728&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        var r_nav_but : Button = findViewById(R.id.r_block)
        r_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450993716256225, 77.28880547617123&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }


        var t_nav_but : Button = findViewById(R.id.t_block)
        t_nav_but.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=28.450252864454242, 77.28677133537445&mode=w"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}