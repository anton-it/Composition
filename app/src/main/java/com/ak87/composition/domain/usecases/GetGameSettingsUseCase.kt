package com.ak87.composition.domain.usecases

import com.ak87.composition.domain.entity.GameSettings
import com.ak87.composition.domain.entity.Level
import com.ak87.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}