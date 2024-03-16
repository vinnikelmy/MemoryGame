package com.example.memorygame.memory_feature.domain.model

class MemoryCard(
    var value: Int,
    var isBackDisplayed: Boolean = true,
    var matchFound: Boolean = false
) {
    fun flipCard() {
        isBackDisplayed = !isBackDisplayed
    }
}