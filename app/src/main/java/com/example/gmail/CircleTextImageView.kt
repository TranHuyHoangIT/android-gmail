package com.example.gmail

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import kotlin.random.Random

class CircleTextImageView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val paint = Paint()
    private val textPaint = Paint()
    private var color: Int = Color.BLUE
    private var text: String = ""

    init {
        paint.isAntiAlias = true
        textPaint.isAntiAlias = true
        textPaint.color = Color.WHITE
        textPaint.textAlign = Paint.Align.CENTER
    }

    fun setText(char: Char) {
        text = char.uppercaseChar().toString()
        color = generateRandomColor()
        invalidate()
    }

    private fun generateRandomColor(): Int {
        val rnd = Random
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val radius = width / 2f
        paint.color = color
        canvas.drawCircle(radius, radius, radius, paint)

        textPaint.textSize = radius
        val xPos = width / 2
        val yPos = (canvas.height / 2 - (textPaint.descent() + textPaint.ascent()) / 2)
        canvas.drawText(text, xPos.toFloat(), yPos, textPaint)
    }
}
