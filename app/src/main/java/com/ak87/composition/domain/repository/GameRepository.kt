package com.ak87.composition.domain.repository

import com.ak87.composition.domain.entity.GameSettings
import com.ak87.composition.domain.entity.Level
import com.ak87.composition.domain.entity.Questions

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,  //максимальное значение которое нужно сгенинировать в поле сумма
        countOfOptions: Int // кол-во вариантов ответов
    ): Questions

    fun getGameSettings(level: Level): GameSettings

}