package com.adityat.bhagwadgita

import Chapter15
import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.adityat.bhagwadgita.chapters.Chapter1
import com.adityat.bhagwadgita.chapters.Chapter2
import com.example.prakramapp.chapters.Chapter10
import com.example.prakramapp.chapters.Chapter11
import com.example.prakramapp.chapters.Chapter12
import com.example.prakramapp.chapters.Chapter13
import com.example.prakramapp.chapters.Chapter14
import com.example.prakramapp.chapters.Chapter16
import com.example.prakramapp.chapters.Chapter17
import com.example.prakramapp.chapters.Chapter18
import com.example.prakramapp.chapters.Chapter3
import com.example.prakramapp.chapters.Chapter4
import com.example.prakramapp.chapters.Chapter5
import com.example.prakramapp.chapters.Chapter6
import com.example.prakramapp.chapters.Chapter7
import com.example.prakramapp.chapters.Chapter8
import com.example.prakramapp.chapters.Chapter9
import com.google.android.gms.ads.MobileAds


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MobileAds.initialize(this)
        loadInterstitial(this)
        setContent {
            MyNavigation(this)
        }

    }
    override fun onDestroy() {
        removeInterstitial()
        super.onDestroy()
    }

}



@Composable
fun MyNavigation(context: Context){
    val navController =rememberNavController()

    NavHost(navController = navController, startDestination = firstscreen.route ){
        composable(firstscreen.route){
            Prakram(navController,context)
        }

        composable(gita_content.route)
        {
            GitaScreen(navController, context)
        }
        composable(chapter1.route)
        {
            Chapter1(navController)
        }
        composable(chapter2.route)
        {
            Chapter2(navController)
        }
        composable(chapter3.route)
        {
            Chapter3(navController)
        }
        composable(chapter4.route)
        {
            Chapter4(navController)
        }
        composable(chapter5.route)
        {
            Chapter5(navController)
        }
        composable(chapter6.route)
        {
            Chapter6(navController)
        }
        composable(chapter7.route)
        {
            Chapter7(navController)
        }
        composable(chapter8.route)
        {
            Chapter8(navController)
        }
        composable(chapter9.route)
        {
            Chapter9(navController)
        }
        composable(chapter10.route)
        {
            Chapter10(navController)
        }
        composable(chapter11.route)
        {
            Chapter11(navController)
        }
        composable(chapter12.route)
        {
            Chapter12(navController)
        }
        composable(chapter13.route)
        {
            Chapter13(navController)
        }
        composable(chapter14.route)
        {
            Chapter14(navController)
        }
        composable(chapter15.route)
        {
            Chapter15(navController)
        }
        composable(chapter16.route)
        {
            Chapter16(navController)
        }
        composable(chapter17.route)
        {
            Chapter17(navController)
        }
        composable(chapter18.route)
        {
            Chapter18(navController)
        }



    }
}




