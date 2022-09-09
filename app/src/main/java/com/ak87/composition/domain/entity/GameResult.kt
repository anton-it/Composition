package com.ak87.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class GameResult (
    val winner: Boolean, //победили или нет
    val countOfRightAnswers: Int, //кол-во правильных ответов
    val countOfQuestions: Int, //кол-во вопросов на которое ответил юзер
    val gameSettings: GameSettings //настройки игры
        ): Parcelable
