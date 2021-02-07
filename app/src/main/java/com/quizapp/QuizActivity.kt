package com.quizapp

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.ContextThemeWrapper
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mQuestionList = Constant.getQuestions()
        setQuestion()

        answer1.setOnClickListener (this)

        answer2.setOnClickListener (this)

        answer3.setOnClickListener (this)

        answer4.setOnClickListener (this)
    }

    fun setQuestion(){

        mCurrentPosition = 1
        var question = mQuestionList!![mCurrentPosition - 1]

        defaultOptionView()

        progressBar.progress = mCurrentPosition
        number_count.text = "${mCurrentPosition} / ${mQuestionList!!.size}"

        questionM.text = question.question
        questionImages.setImageResource(question.image)
        answer1.text = question.optionOne
        answer2.text = question.optionTwo
        answer3.text = question.optionThree
        answer4.text = question.optionFour
    }

    fun defaultOptionView() {
        var options = ArrayList<TextView>()
        options.add(0, answer1)
        options.add(1, answer2)
        options.add(2, answer3)
        options.add(3, answer4)

        for (option in options) {
            option.setBackgroundResource(R.drawable.default_option_border)
        }
    }

    override fun onClick(p0: View?) {
            when (p0!!.id) {
                R.id.answer1 -> selectedOptionView(answer1, 1)
                R.id.answer2 -> selectedOptionView(answer2, 2)
                R.id.answer3 -> selectedOptionView(answer3, 3)
                R.id.answer4 -> selectedOptionView(answer4, 4)
            }
    }

    private fun selectedOptionView(tv: TextView, SelectedOptionNumber: Int){
        defaultOptionView()
        mSelectedOptionPosition = SelectedOptionNumber

        tv.setTypeface(tv.typeface, Typeface.MONOSPACE.weight)
        tv.setBackgroundResource(R.drawable.selected_options_border)
    }
}