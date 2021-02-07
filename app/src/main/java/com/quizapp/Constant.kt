package com.quizapp

import android.graphics.Insets.add
import androidx.core.view.OneShotPreDrawListener.add
object Constant {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val q_name = "What country does this flag belong to?"

        val q1 = Question(1, q_name,
            R.drawable.panama_flag,
            "Guyana",
            "Peru",
            "Bolivia",
            "Panama",
            4)

        val q2 = Question(2, q_name,
        R.drawable.afghanistan_flag,
        "Armenia",
        "Afghanistan",
        "Aruba",
        "Azerbaijan",
        2)

        val q3 = Question(2, q_name,
            R.drawable.aruba,
            "Aruba",
            "Austria",
            "Cyprus",
            "Belarus",
            1)

        val q4 = Question(2, q_name,
            R.drawable.azerbaijan_flag,
            "Aruba",
            "Bangladesh",
            "Azerbaijan",
            "Papua New Guinea",
            3)

        val q5 = Question(2, q_name,
            R.drawable.antigua_and_barbuda_flag,
            "Norfolk Island",
            "Antigua and Barbuda",
            "Trinidad and Tobago",
            "American Samoa",
            3)

        questionList.add(q1)
        questionList.add(q2)
        questionList.add(q3)
        questionList.add(q4)
        questionList.add(q5)
        return questionList
    }
}