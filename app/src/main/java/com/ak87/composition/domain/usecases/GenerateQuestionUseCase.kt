package com.ak87.composition.domain.usecases

import com.ak87.composition.domain.entity.Questions
import com.ak87.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Questions {
        return repository.generateQuestion(maxSumValue, 6)
    }

    private companion object{
        private const val COUNT_OF_OPTIONS = 6
    }
}