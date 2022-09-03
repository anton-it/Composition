package com.ak87.composition.domain.entity

data class Questions (
    val sum: Int, //значение суммы
    val visibleNumber: Int, //левое число в квандарте
    val options: List<Int> //варианты ответов
        )