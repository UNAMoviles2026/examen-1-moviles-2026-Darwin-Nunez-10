package com.moviles.examenmoviles.data

import com.moviles.examenmoviles.model.CoworkingSpace

object MockData {
    val spaces = listOf(
        CoworkingSpace(1, "Creative Hub", "A bright space for artists.", "Downtown", 10, 15.0, true, ""),
        CoworkingSpace(2, "Tech Lab", "High speed internet and coffee.", "Silicon Valley", 20, 25.0, false, ""),
        CoworkingSpace(3, "Silent Office", "Perfect for deep work.", "Suburbia", 5, 10.0, true, ""),
        CoworkingSpace(4, "Meeting Point", "Spacious room for teams.", "Financial District", 50, 50.0, true, "")
    )
}