package com.ak87.composition.domain.repository

import com.ak87.composition.domain.entity.GameSettings
import com.ak87.composition.domain.entity.Level
import com.ak87.composition.domain.entity.Questions

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Questions

    fun getGameSettings(level: Level): GameSettings

}