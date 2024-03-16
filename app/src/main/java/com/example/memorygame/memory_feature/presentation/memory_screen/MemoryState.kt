package com.example.memorygame.memory_feature.presentation.memory_screen

import com.example.memorygame.memory_feature.domain.model.MemoryCard
import com.example.memorygame.memory_feature.domain.util.generateCardsArray
import com.example.memorygame.memory_feature.presentation.util.NumericValues.STARTING_PAIRS
import com.example.memorygame.ui.theme.HolidayTheme
import com.example.memorygame.ui.theme.ThanksgivingTheme

data class MemoryState (
    val cards: Array<MemoryCard> = generateCardsArray(STARTING_PAIRS),
    val card1: Int? = null,
    val card2: Int? = null,
    val pairCount: Int = STARTING_PAIRS,
    val pairsMatched: Int = 0,
    val clickCount: Int = 0,
    val currentTheme: HolidayTheme = ThanksgivingTheme(),
)